package Lesson2_medium;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("number please"); 
		int number = sc.nextInt();
		 
		while(number>0) {
			int res = number * number;
			if((res) > 30){
				System.out.println(res + "\n");
			}
			
			System.out.println("number please"); 
			number = sc.nextInt();
				
		}
		
		
			

	}

}
