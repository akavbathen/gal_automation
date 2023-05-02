package Conditions;

import java.util.Iterator;
import java.util.Stack;

public class ex4 {

	public static void main(String[] args) {
		String name = "Bat";
		String name1 = "Nataly";
		
		double Grade_name = 90;
		double Grade_name1 = 88;
		
		if (Grade_name>Grade_name1) {
			System.out.println(name);
		}else {
			System.out.println(name1);
		}
				
		
		
		
		
		String[] names = new String[] {"Bat", "Nataly"};
		double[] grades = new double[] {90, 88};
		
		int max_idx = 0;
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] > grades[max_idx]) {
				max_idx = i;	
			}
		}
		
		System.out.println(names[max_idx]);

	}

}
