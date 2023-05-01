package Lesson2_advance;

import java.util.Iterator;

public class ex1 {
	
	public static boolean is_prime(int k) {
		
		for(int i = 2; i < k / 2; i++) {
			if (k % i == 0) {
				return false;
			}		
		}
	
		return true;
	}

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			
			if (is_prime(i)== true) {
				System.out.println(i +" is prime");
			}
			
		}

	}

}
