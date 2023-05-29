package horasha_basics;

public class Motorcycle extends Vehicle {
	
	private boolean hasSideCar;

	public Motorcycle(int year, double price, String color, boolean hasSideCar) {
		
		super(year, price, color);
		this.hasSideCar = hasSideCar;
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	public void printInfo() {
		System.out.println("hasSideCar:" + isHasSideCar());
		super.printInfo();
		
	}

	@Override
	public String toString() {
		return "Motorcycle [hasSideCar=" + hasSideCar + "]" + super.toString();
	}
	
}
