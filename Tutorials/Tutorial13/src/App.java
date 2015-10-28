class Person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name + " and age is " + age + " years old");
	}
	void Hello() {
		System.out.println("Hello There");
		
	}
	// 1. Data
	// 2. Subroutines (methods)
}

class Home {
	String add;
	int pin;
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.age = 23;
		System.out.println(person1.name);

		person2.speak();
		person2.Hello();

		Home home1 = new Home();
		home1.add = "Sunset Avenue";
		home1.pin = 3678;

		System.out.println(home1.add + " " + home1.pin);

	}

}
