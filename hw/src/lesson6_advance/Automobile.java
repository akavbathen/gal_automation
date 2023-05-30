package lesson6_advance;

public class Automobile {
	
	private String color;
	private double length;
	private int year;
	private String type;
	private Radio radio;
	
	
	public Automobile(String color, double length, int year, String type, Radio radio) {
		
		super();
		this.color = color;
		this.length = length;
		this.year = year;
		this.type = type;
		this.radio = radio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	public void turnOnRadio() {
		this.radio.setStatus(true);
		
	}
	
	public void turnOffRadio() {
		this.radio.setStatus(false);
	}
	
	public void changeStation() {
		
		
	}
	
	public boolean getRadioState() {
		 return this.radio.isOn();
		
	}
	
	public Station getRadioStation() {
		 a = radio.getStation();
		 
	}
}
