package lesson6_medim;

public class Leg {

	private double Length;

	public Leg(double length) {
		
		Length = length;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	@Override
	public String toString() {
		return "Leg [Length=" + Length + "]";
	}

	
	
	
}
