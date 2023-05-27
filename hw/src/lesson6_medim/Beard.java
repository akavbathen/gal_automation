package lesson6_medim;

public class Beard {
	
	private String color;
	private double lenght;
	
	
	public Beard(String color, double lenght) {
		
		this.color = color;
		this.lenght = lenght;
		
	}
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getLenght() {
		return lenght;
	}


	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	@Override
	public String toString() {
		return "Beard [color=" + color + ", lenght=" + lenght + "]";
	}
	
	
	
}
