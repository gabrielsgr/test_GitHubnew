package socialMedia;

import java.util.ArrayList;

public abstract class Post {

	private long timestamp;
	private int likes;
	ArrayList<Comments>comments = new ArrayList();
	
	
	public Post(long timestamp, int likes, ArrayList<Comments> comments) {
		super();
		this.timestamp = timestamp;
		this.likes = likes;
		this.comments = comments;
	}
	
	
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<Comments> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comments> comments) {
		this.comments = comments;
	}


	public String toString() {
		return this.timestamp + " " + this.comments + " " + this.likes + "<3";
	}
	
	//TODO
	public void addPost() {
		
	}
	
	
	public void removePost() {
		
	}
	
	
	public void addLike() {
		
	}
	
	
	public void removeLike() {
		
	}
	
}
