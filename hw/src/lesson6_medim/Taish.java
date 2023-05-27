package lesson6_medim;

import java.awt.Color;
import java.util.Arrays;

public class Taish {
	 private double age;
	 private double Weight;
	 private String color;
	 private Beard beard;
	 private Leg[] legs;
	 private Tail tail;
	 
	public Taish(double age, double weight, String color, Beard beard, Leg[] legs, Tail tail) {
		
		this.age = age;
		this.Weight = weight;
		this.color = color;
		this.beard = beard;
		this.legs = legs;
		this.tail = tail;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Beard getBeard() {
		return beard;
	}

	public void setBeard(Beard beard) {
		this.beard = beard;
	}

	public Leg[] getLegs() {
		return legs;
	}

	public void setLegs(Leg[] legs) {
		this.legs = legs;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "Taish [age=" + age + ", Weight=" + Weight + ", color=" + color + ", beard=" + beard + ", legs="
				+ Arrays.toString(legs) + ", tail=" + tail + "]";
	}
	 
	 
	
}
