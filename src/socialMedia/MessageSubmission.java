package socialMedia;

import java.util.ArrayList;

public class MessageSubmission extends Post{
	
	private String textMessage;

	
	public MessageSubmission(long timestamp, int likes, ArrayList<Comments> comments, String textMessage) {
		super(timestamp, likes, comments);
		this.textMessage = textMessage;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
	

}
