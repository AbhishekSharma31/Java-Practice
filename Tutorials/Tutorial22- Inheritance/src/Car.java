public class Car extends Machine {

	// private String name ="Machine Type 1";

	@Override
	public void start() {
		System.out.println("Car Started");
		// TODO Auto-generated method stub
		super.start();
	}

	public void wipeWindSheild() {
		System.out.println("Wiping Wind Sheild");
	}

	public void showInfo() {
		System.out.println("Car name:" + name);

	}
}
