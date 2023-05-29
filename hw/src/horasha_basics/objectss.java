package horasha_basics;

public class objectss {

	public static void main(String[] args) {
		
		
		Motorcycle moto = new Motorcycle(1980, 100000, "blue", true);
		Truck truck = new Truck(1940, 150000, "yellow", 2);
		Car car = new Car(2020, 130000, "black", 4);
		
		//System.out.print(moto.toString());
		//System.out.print(truck.toString());
		//System.out.print(car.toString());
		
		moto.printInfo();
		truck.printInfo();
		car.printInfo();
	}

}
