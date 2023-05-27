package horasha_lesson6_basics;

public class Student extends Person {

	private String courseName;
	private boolean active;
	
	public Student(String name, String email, long birhYear, String courseName, boolean active) {
		
		super(name, email, birhYear);
		this.courseName = courseName;
		this.active = active;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	public void printInfo() {
		
		System.out.println("courseName:" + this.courseName +"," + " active " + this.active +" ");
		super.printInfo();
	}
		
	
}		
