package lesson4_basics;

public class Circle {

	private double area;
	private String color;
	
	public Circle(double area, String color) {
		
		this.area = area;
		this.setColor(color);
	}
	
	

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		
	}
	
	public  String toString() {
		
		return "Circle: area +" + this.area + " color:"+ this.color;
		
	}
	
}


