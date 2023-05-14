package lesson4_advance;

import lesson4_basics.Cat;
import java.util.ArrayList;

public class Studens {

	public static void main(String[] args) {
		double sum_grades = 0;
		ArrayList<Student> students;
		students = new ArrayList<Student>();
		
		
		double[]grades_one;
		grades_one = new double[3];
		grades_one[0] = 5;
		grades_one[1] = 10;
		grades_one[2] = 3;
		Cat alfi = new Cat(10, "Alfi", "brown");
		
		Student one = new Student("one", "one@one.co.il", 15, true, "Batyam", grades_one, alfi);
		System.out.println(one.toString());
		sum_grades += one.average();
		students.add(one);
		
		double[]grades_two = new double[3];
		grades_two[0] = 8;
		grades_two[1] = 7;
		grades_two[2] = 6;
		
		Student two = new Student("two", "two@one.co.il", 25, true, "Tel Aviv",grades_two, alfi);
		System.out.println(two.toString());
		System.out.println("average:"+two.average());
		sum_grades += two.average();
		students.add(two);
		
		
		double[]grades_tree = new double[3];
		grades_tree[0] = 7;
		grades_tree[1] = 2;
		grades_tree[2] = 4;
		
		
		Student tree = new Student("tree", "tree@one.co.il", 14, false, "Holon",grades_tree, alfi);
		System.out.println(tree.toString());
		sum_grades += tree.average();
		students.add(tree);
		
		double[]grades_four = new double[3];
		grades_four[0] = 5;
		grades_four[1] = 2;
		grades_four[2] = 2;
		
		Student four = new Student("four", "four@one.co.il", 30, true, "yafo",grades_four, alfi);
		System.out.println(four.toString());
		sum_grades += four.average();
		students.add(four);
		
		
		double[]grades_five = new double[3];
		grades_five[0] = 7;
		grades_five[1] = 1;
		grades_five[2] = 8;
		
		Student five = new Student("five", "five@one.co.il", 20, true, "Tel Aviv",grades_five, alfi);
		System.out.println(five.toString());
		sum_grades += five.average();
		students.add(five);
		
		System.out.println(sum_grades/students.size());
	
	}

}
