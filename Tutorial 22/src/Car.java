
public class Car extends Machine{
	
	public void start(String name){
		System.out.println(name + " started.");
	}
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
