package BUILDER_CREATIONALDESIGNPATTREN;

public class HouseDirector01 {
	
	private houseBuilder01 houseBuilder;

	public HouseDirector01(houseBuilder01 houseBuilder) {
		super();
		this.houseBuilder = houseBuilder;
	}
	
	public house01 buildHouse() {
		houseBuilder.builddoorType();
		houseBuilder.buildRoof();
		houseBuilder.buildStories();
		return houseBuilder.gethouse();
		
	}
	

}
