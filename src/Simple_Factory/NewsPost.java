package Simple_Factory;

import java.time.LocalDate;

public class NewsPost extends Post {
	private String Headline;
	private LocalDate newsTime;
	public String getHeadline() {
		return Headline;
	}
	public void setHeadline(String headline) {
		Headline = headline;
	}
	public LocalDate getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(LocalDate newsTime) {
		this.newsTime = newsTime;
	}
	
	

}
