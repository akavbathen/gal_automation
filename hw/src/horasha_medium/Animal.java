package horasha_medium;

public class Animal {

	private String name;
	private String color;
	
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void howDoYouLive() {
		
		System.out.println("I breath oxygen");
		System.out.println(getName());
		System.out.println(getColor());
	}
	
	public void howManyLegs () {
		
		System.out.print("this question is too general");
	}
	
	
}
