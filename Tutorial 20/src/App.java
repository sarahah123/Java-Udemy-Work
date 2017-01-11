
public class App {
	public static void main(String[] args) {
		//Inefficient
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		//More efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		//print auto to string
		System.out.println(sb);
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
				
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s);
		
		////// Formating//////
		
		System.out.println("Here is some text. \tThat was a tab\nThat was a new line.");
		
		//Formatting int
		System.out.printf("Total cost %-10d; the quantitiy is %10d\n", 5, 120);
		
		
		for(int i=0; i <20;i++){
			System.out.printf("%2d: some text here\n", i);
		}
		
		//Formatting Strings
		for(int i=0; i <20;i++){
			System.out.printf("%-2d: %s\n",i, "Here is some text");
		}
		
		//Formatting float point values
		System.out.printf("Total value: %.2f\n", 5.6876);
		System.out.printf("Total value: %6.1f\n", 343.6876);
	}
}
