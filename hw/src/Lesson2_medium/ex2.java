package Lesson2_medium;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your age?"); 
		int age = sc.nextInt();
		System.out.println("your age is "+ age);
		
		
		while (age!= -1) {
			if(age <= 18) {
				System.out.println("you are a minor"+"\n");
			}	
			if(age >= 65) {
				System.out.println("you are a pensioner"+"\n");
			}
			
			System.out.print("What is your age?");
			age = sc.nextInt();
	    	
	    	
		}
		sc.close();

	}

}
