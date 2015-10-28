class Machine {
	public void start() {
		System.out.println("Starting Machine....");
	}
}

interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera Snapping...");

			}
		};

		machine1.start();

		// Cannot be instantiated
		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant growing");
			}
		};
		plant1.grow();
	}
}
