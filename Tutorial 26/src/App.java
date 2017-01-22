
public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant jdk = tree;
		
		
		jdk.grow();
		
		
		tree.shedLeaves();
	
		
		//What matters is type of reference
		//jdk.shedLeaves();
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
