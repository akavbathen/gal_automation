package Lesson2_medium;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your age?"); 
		int age = sc.nextInt();
		System.out.println("your age is "+ age);
		
		while (age!= -1) {
			
			System.out.print("What is your age?");
	    	age = sc.nextInt();
	    	System.out.println("your age is "+ age+ "\n");
	    	
		}
		sc.close();
	}

}
