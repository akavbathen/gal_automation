package lesson4_medum;

public class Circle {

	private String color;
	private double radius;
	
	public Circle(String color, double radius) {
	
		this.color = color;
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	 
	public double calcAreaCircle() {
		
		
		double areaCircle = this.radius*this.radius * Math.PI;
		return areaCircle;
		
	}
}
