package abstractClass;

public abstract class ShapeForm {
	
	private int xCore;
	private int yCore;
	
	
	public ShapeForm(int xCore, int yCore) {
		super();
		this.xCore = xCore;
		this.yCore = yCore;
	}

	
	public int getxCore() {
		return xCore;
	}
	public void setxCore(int xCore) {
		this.xCore = xCore;
	}
	public int getyCore() {
		return yCore;
	}
	public void setyCore(int yCore) {
		this.yCore = yCore;
	}


	public double calculateCircumference;
	
	public double calculateArea;

}
