package BUILDER_CREATIONALDESIGNPATTREN;

public class house01 {
	
	private String stories;
	private String roofType;
	private String doorType;
	public String getStories() {
		return stories;
	}
	public void setStories(String stories) {
		this.stories = stories;
	}
	public String getRoofType() {
		return roofType;
	}
	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}
	public String getDoorType() {
		return doorType;
	}
	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}
	@Override
	public String toString() {
		return "house01 [stories=" + stories + ", roofType=" + roofType + ", doorType=" + doorType + "]";
	}
	public house01(String stories, String roofType, String doorType) {
		super();
		this.stories = stories;
		this.roofType = roofType;
		this.doorType = doorType;
	}
	public house01() {
	}
	
	
	

}
