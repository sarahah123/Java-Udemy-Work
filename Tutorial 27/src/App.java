
class Plant {
	
	public static final int ID = 7;
	private String name;
	
	//Constructor 
	
	public Plant () {
		System.out.println(name + " " + ID);
	}
	
	public Plant(String name) {
		System.out.println(name + " " + ID);
	}
	
	//Other methods
	
	public String getData() {
		String data = "Some Stuff " + calculateGrowth(); 
		
		return data;
	}
	
	private int calculateGrowth() {
		return 9;
	}

	//Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class App {
	public static void main(String[] args) {
		Plant rose = new Plant();
		Plant tulip = new Plant("Tulip");
		
		rose.setName("Rose");
		System.out.println(rose.getName());
		System.out.println(rose.getData());
	}
}
