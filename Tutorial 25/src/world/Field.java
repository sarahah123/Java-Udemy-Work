package world;


public class Field {
	private Plant fern = new Plant();
	
	public Field() {
		//size is protected and field is in the same package as plant
		System.out.println(fern.size);
	}
}
