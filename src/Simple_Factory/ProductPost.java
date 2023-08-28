package Simple_Factory;

import java.time.LocalDate;

public class ProductPost extends Post {
	private String imageURL;
	private LocalDate name;
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public LocalDate getName() {
		return name;
	}
	public void setName(LocalDate name) {
		this.name = name;
	}
	
	
	
	

}
