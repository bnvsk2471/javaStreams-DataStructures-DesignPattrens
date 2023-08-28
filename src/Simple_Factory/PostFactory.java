package Simple_Factory;

public class PostFactory {
	
	public static Post createPost(String type) {
		switch(type) {
		case "News":
			return new NewsPost();
		case "Product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("post type is unknown");	
		}
	}
}
