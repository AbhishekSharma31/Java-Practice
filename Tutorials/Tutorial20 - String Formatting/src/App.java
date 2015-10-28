public class App {

	public static void main(String[] args) {

		// Inefficient
		String info = "";

		info += "My name is Bob. ";
		info += "";
		info += "I am a builder";
		System.out.println(info);

		StringBuilder sb = new StringBuilder("");

		// More Efficient
		sb.append("My name is Sue. ");
		sb.append(" ");
		sb.append("I am a lion tamer");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("My name is Roger. ").append("").append("I am a skydiver");
		System.out.println(s.toString());

		// //Formatting ///////////

		System.out
				.println("here is some text\t That was a tab. \n That was a new line.");
		System.out.println("More text");

		System.out.printf("Total cost %-10d :quantity is %d", 5, 120);
		//Formatting Integers
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d: some more text here\n %s", i, "here is some text");
		}
		//Formatting Floating point value

		System.out.printf("Total value: %.2f\n",5.6988);
		System.out.printf("Total value: %5.1f\n",455.6988);
		
	}
}
