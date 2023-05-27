package horasha_lesson6_basics;

public class MyStudens {

	public static void main(String[] args) {
		
		Student one = new Student("bat", "bathen@", 1990, "matematica", false);
		Student two = new Student("ben", "ben@", 1998, "pizika", true);
		Student three = new Student("gal", "gal@", 1994, "matematica", false);
		
		one.printInfo();
		two.printInfo();
		three.printInfo();

		
	}
	
		
}
