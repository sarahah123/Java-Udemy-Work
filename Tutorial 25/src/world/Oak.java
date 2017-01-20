package world;


public class Oak extends Plant {
	public Oak() {
		//cannot do as type is a private class
		//type = "plant";
		
		
		//can access protected as oak is a subclass of plant
		this.size = "large";
		
		//not specified/ no access specifier; works because oak and plant are in the same package 
		this.height = 10;
	}
}
