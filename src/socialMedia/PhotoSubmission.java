package socialMedia;

import java.util.ArrayList;

public class PhotoSubmission extends Post{

	private String dataName;
	private String captionOfThePicture;
	
	
	public PhotoSubmission(long timestamp, int likes, ArrayList<Comments> comments, String dataName, String captionOfThePicture) {
		super(timestamp, likes, comments);
		this.dataName = dataName;
		this.captionOfThePicture = captionOfThePicture;
	}


	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	public String getCaptionOfThePicture() {
		return captionOfThePicture;
	}
	public void setCaptionOfThePicture(String captionOfThePicture) {
		this.captionOfThePicture = captionOfThePicture;
	}
	
	
}
