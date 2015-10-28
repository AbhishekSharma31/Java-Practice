class Frog {
	private String name;
	private int age;

	public void setName(String Name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}

}

public class App {
	public static void main(String[] args) {

		Frog frog1 = new Frog();

		// frog1.name = "Betty";
		// frog1.age = 12;

		frog1.setName("Jammy");
		frog1.setAge(22);

		System.out.println(frog1.getName());

	}
}
