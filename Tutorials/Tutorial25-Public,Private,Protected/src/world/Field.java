package world;

public class Field {
	
	private Plant plant = new Plant();
	
	public Field(){
		//size is protected; Field is in same package as Plant.
		System.out.println(plant.size);
	}

}
