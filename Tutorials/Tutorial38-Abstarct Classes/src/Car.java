public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Starting Car");

	}

	@Override
	public void dostuff() {
		System.out.println("do stuff in the car");
	}

	@Override
	public void shutdown() {
		System.out.println("Shutdown car");
	}

}
