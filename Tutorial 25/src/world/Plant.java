package world;

public class Plant {
	//Bad practice to use public as it can be reached anywhere by anyone
	public String name;
	
	//Okay to use it in regards to final and static/constants 
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		name = "Rose";
		type = "plant";
		size = "small";
		height = 3;
	}
}
