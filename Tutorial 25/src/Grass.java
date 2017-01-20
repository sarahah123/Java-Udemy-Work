import world.Plant;


public class Grass extends Plant{
	public Grass() {
		//won't work grass is in different package, even though grass is a subclass
		//System.out.println(this.height);
		
		System.out.println(this.size);
	}
}
