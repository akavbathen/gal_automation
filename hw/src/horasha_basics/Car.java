package horasha_basics;

public class Car extends Vehicle {

	private int numberOfDoors;

	public Car(int year, double price, String color, int numberOfDoors) {
		super(year, price, color);
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public void printInfo() {
		System.out.print("numberOfDoors:"+ getNumberOfDoors() + " ");
		super.printInfo();
	}

	@Override
	public String toString() {
		return "Car [numberOfDoors=" + numberOfDoors + " ]" + super.toString();
	}
	
}
