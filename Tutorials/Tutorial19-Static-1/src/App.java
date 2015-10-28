class Thing {
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName(){
		System.out.println("Object Id: " + id +" ,"+ description +" : "+ name);
	}

	public static void showInfo() {
		System.out.println(description);
		//System.out.println(name);
	}
}

public class App {
	
	public static void main(String[] args) {
		
		Thing.description = "I am a Thing.";
		
		System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is " + Thing.count);

		thing1.name = "Bob";
		thing2.name = "Betty";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		//Math.PI=3;
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);


	}

}
