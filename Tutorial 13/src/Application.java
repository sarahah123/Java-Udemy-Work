class Person{
	//Instance Variables
	
	String name;
	int age;
	
	/*
	Classes can contain
	
	1. Data
	2. Subroutines (methods)
	*/
}



public class Application {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		Person person2 = new Person();
		
		person2.name = "Gavin Burns";
		person2.age = 27;

	}
}
