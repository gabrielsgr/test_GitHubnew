package socialMedia;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Post>posts = new ArrayList();

	
	public ArrayList<Post> getPosts() {
		return posts;
	}
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "NewsFeed [posts=" + posts + "]";
	}
	public NewsFeed(ArrayList<Post> posts) {
		super();
		this.posts = posts;
	}
	
	public void addPost(Post posts) {
		
	}
	
	
	public void removePost(int index) {
		
	}
	
	
	public void display() {
		
	}
}
