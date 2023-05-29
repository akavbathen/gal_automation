package horasha_basics;


public abstract class Vehicle {

	private int year;
	private double price;
	private String color;
	
	public Vehicle(int year, double price, String color) {
		
		this.year = year;
		this.price = price;
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void printInfo() {
		
		System.out.println(" Vehicle: year" + this.year + " price:" + this.price + " color:" + this.color);
		
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", price=" + price + ", color=" + color + "]";
	}

	

	
	
}


