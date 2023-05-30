package lesson6_advance;

public class Station {
	  
	private String name;
	private double frequency;
	
	public Station(String name, double frequency) {
		super();
		this.name = name;
		this.frequency = frequency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
}
