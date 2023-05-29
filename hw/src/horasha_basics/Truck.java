package horasha_basics;

public class Truck extends Vehicle {
	
	private int numberOfAxlesa;

	public Truck(int year, double price, String color, int numberOfAxlesa) {
		super(year, price, color);
		
		this.numberOfAxlesa = numberOfAxlesa;
	}

	public int getNumberOfAxlesa() {
		return numberOfAxlesa;
	}

	public void setNumberOfAxlesa(int numberOfAxlesa) {
		this.numberOfAxlesa = numberOfAxlesa;
	}
	public void printInfo () {
		System.out.print("numberOfAxlesa: " + getNumberOfAxlesa()+" ");
		super.printInfo();
		
	}

	@Override
	public String toString() {
		return "Truck [numberOfAxlesa= " + numberOfAxlesa + "]";
	}
	
}
