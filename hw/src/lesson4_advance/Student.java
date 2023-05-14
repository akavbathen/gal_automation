package lesson4_advance;

import lesson4_basics.Cat;

public class Student {

	private String name;
	private String email;
	private int age;
	private boolean isMale;
	private String city;
	private double[]grades;
	private Cat my_cat;
	
	public Student(String name, String email, int age, boolean isMale, String city, double[]grades, Cat bathen) {
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.isMale = isMale;
		this.city = city;
		this.grades = grades;
		this.my_cat = bathen;
	}
	
	
	public String toString() {
		
		return "Student[name:" + this.name+ " email:" +this.email +" age:" + this.age + " is isMale:" + this.isMale + " city:" + this.city + " grades"
				+ java.util.Arrays.toString(this.grades)+ this.my_cat.toString() ;
 
		
	}
	
	public double average() {
		
		double sum = 0;
		double avg;
		for (int i = 0; i < grades.length; i++) {
			
			sum = sum + grades[i];
			
		}
		avg= sum / grades.length;
		return avg;		
	}
}
