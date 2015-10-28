package world;

public class Oak extends Plant {

	public Oak() {

		// Wont work type is private
		// type = "Plant";
		// size is potected
		this.size = "large";
		// no access specifier, will work
		this.height = 10;

	}

}
