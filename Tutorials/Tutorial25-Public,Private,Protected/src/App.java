import world.Plant;
/*
 * private -- only within same class
 * public -- from anywhere
 * protected -- same class, subclass, and same package
 * no modifier -- same package only
 */

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();

		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		//Wont work type is private
		//System.out.println(plant.type);
		//wont work size is protected; App is not in the same package
		//System.out.println(plant.size);
		//wont work size is protected; App is not in the same package
		//System.out.println(plant.height);

	}
}
