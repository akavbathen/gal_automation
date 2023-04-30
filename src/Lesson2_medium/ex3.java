package Lesson2_medium;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("number please"); 
		int number = sc.nextInt();
			
		while (number != -1) {
			
			if(number%2 == 0) {
				System.out.println("the " + number+ " is Even"+"\n");
			}else 
				System.out.println("the " + number+ " is odd"+"\n");
			
			System.out.println("number please"); 
			number = sc.nextInt();
			
		}
				
		
		

	}

}
