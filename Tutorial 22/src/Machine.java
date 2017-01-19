
public class Machine {
	private String type = "TV";
	protected String name = "Machine type I";
	
	public void start(String name){
		System.out.println(name + " started.");
	}
	
	public void stop() {
		System.out.println("Machine stopped.");
	}
}
