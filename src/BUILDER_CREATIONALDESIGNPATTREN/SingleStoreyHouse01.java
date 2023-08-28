package BUILDER_CREATIONALDESIGNPATTREN;

public class SingleStoreyHouse01 implements houseBuilder01 {

	private house01 house=new house01();
	@Override
	public void buildRoof() {
		house.setRoofType("Sloped");

	}

	@Override
	public void buildStories() {
		house.setStories("Sinle");

	}

	@Override
	public void builddoorType() {
		house.setDoorType("Single");

	}

	@Override
	public house01 gethouse() {
		return house;

	}

}
