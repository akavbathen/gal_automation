package Lesson3_advance;

import java.util.Iterator;

public class ex1 {

	public static void main(String[] args) {
		
		int[] numbers1 = {2,4,8,6,6,1,5,4,17,22};
		int[] numbers2 = {2,4,8,7,6,1,5,4,17,22};
		
		System.out.println(equals(numbers1,numbers2));
	}
	
	
	public static boolean equals(int[]arry1,int[]arry2) {
		boolean equal = true;
		
		if (arry1.length != arry2.length) {
			equal = false;
			return equal;
		}
		
		for (int i = 0; i < arry1.length; i++) {
			
			for (int j = 0; j < arry2.length; j++) {
				if (arry1[i] != arry2[i]) {
					equal = false;
					break;
				}
			}
			
			if (equal == false) {
				break;
			}
		}
		
		
		
		return equal;
	}
}
