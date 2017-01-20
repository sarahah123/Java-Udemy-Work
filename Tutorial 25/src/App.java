import world.Plant;

 /* 	
  * 	Private = only within same class
  * 	Public = from anywhere
  * 	Protected = same class, same subclass, and same package
  *		no modifier = same package only 
  */

public class App {
	public static void main(String[] args) {
		Plant flower = new Plant();
		
		System.out.println(flower.name);
		
		System.out.println(flower.ID);
		
		//Won't work, type is private
		//System.out.println(flower.type);
		
		//size is protected; plant is in a different package, your princess is in a different castle
		//System.out.println(flower.size);
		
		//won't work, in different in packages; height has package level visibility 
		//System.out.println(flower.height);
	}
}
