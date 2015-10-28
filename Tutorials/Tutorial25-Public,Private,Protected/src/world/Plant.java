package world;

public class Plant {
	// Bad Practice

	public String name;
	// Acceptable practice -- it is final
	public final static int ID = 8;

	protected String size;

	private String type;

	int height;

	public Plant() {
		this.name = "Freddy";
		this.type = "Plant";
		this.size = "medium";
		this.height = 8;
	}
}
