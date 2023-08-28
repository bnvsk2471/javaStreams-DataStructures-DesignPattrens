package Simple_Factory;

public class PostClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Post post=PostFactory.createPost("News");
		System.out.println(post);

	}

}
