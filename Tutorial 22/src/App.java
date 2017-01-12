
public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();

		mach1.start("Blender");
		mach1.stop();
		
		System.out.println("\n");
		
		Car car1 = new Car();
		
		car1.start("Car");
		car1.wipeWindShield();
		car1.stop();

	}
}
