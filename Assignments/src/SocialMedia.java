
public class SocialMedia {
	
	public static void main(String[] args) {
		User u1 = new User();
		Post p1 = new Post();
		Comment c1 = new Comment();
	}
}

class User {
	private int userID;
	private String username;
	private String post[];
	private String comments[];

	public User(int userID, String username) {
		this.userID = userID;
		this.username = username;
	}
	
	
}

class Post {
	private String user;
	private int likes;
	private String caption;
	
}

class Comment {
	private int commentID;
	private String author;
	private int likes;
	private String reply;
}
