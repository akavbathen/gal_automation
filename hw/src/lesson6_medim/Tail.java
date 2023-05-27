package lesson6_medim;

public class Tail {
	
	private boolean isBig;
	private String color;
	
	public Tail(boolean isBig, String color) {
		
		this.isBig = isBig;
		this.color = color;
	}

	public boolean isBig() {
		return isBig;
	}

	public void setBig(boolean isBig) {
		this.isBig = isBig;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tail [isBig=" + isBig + ", color=" + color + "]";
	}
	
}
