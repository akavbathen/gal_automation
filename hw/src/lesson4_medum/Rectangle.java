package lesson4_medum;

public class Rectangle {
	private String color;
	private static double height;
	private static double width;
	
	public Rectangle(String color, double height, double width) {
		
		this.color = color;
		this.height = height;
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public static double calcAreaRectangle() {
		
		
		double arearectangle = height*width;
		return arearectangle;
}
}