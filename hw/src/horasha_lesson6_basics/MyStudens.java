package horasha_lesson6_basics;

import lesson4_advance.Studens;

public class MyStudens {

	public static void main(String[] args) {
		
		Student one = new Student("bat", "bathen@", 1990, "matematica", false);
		Student two = new Student("ben", "ben@", 1998, "pizika", true);
		Student three = new Student("gal", "gal@", 1994, "matematica", false);
		
		one.printInfo();
		two.printInfo();
		three.printInfo();

		Student[]students = new Student[3];
		students[0]= one; 
		students[1]= two;
		students[2]= three;
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
	
		
}
