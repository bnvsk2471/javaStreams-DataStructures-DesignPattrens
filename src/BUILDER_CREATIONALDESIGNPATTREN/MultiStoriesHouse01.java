package BUILDER_CREATIONALDESIGNPATTREN;

public class MultiStoriesHouse01 implements houseBuilder01 {

	private house01 house=new house01();
	@Override
	public void buildRoof() {
		house.setRoofType("Flat");

	}

	@Override
	public void buildStories() {
		house.setStories("Multiple");

	}

	@Override
	public void builddoorType() {
		house.setDoorType("DoubleDoor");

	}

	@Override
	public house01 gethouse() {
		return house;

	}

}
