package Lesson3_advance;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int[]arr = new int[5];
		
		for (int i = 0; i <5; i++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("write a number pls"); 
			arr[i] = sc.nextInt();
			
		}
		
		
		//int maximum = maxNumber(arr);
		//System.out.println("maximum:"+maximum);
		
		//int minimum = miniNumber(arr);
		//System.out.println("minimum:"+minimum);
		
		//int sum = sumNumber(arr);
		//System.out.println("sum:"+sum);
		
		int avr = averge(arr);
		System.out.println("averge:"+avr);
		
	}
	
	public static int maxNumber(int[]arry) {
		int max = -9999;
		
		for (int i = 0; i < arry.length; i++) {
			if (arry[i]> max) {
				max = arry[i];
			}
		}
		
		
		return max;
	}
	
	public static int miniNumber(int[]arry) {
		int mini = +9999;
		
		for (int i = 0; i < arry.length; i++) {
			if (arry[i]< mini) {
				mini = arry[i];
			}
		}
		
		
		return mini;
		
	}
	
	
	
	
	
	public static int sumNumber(int[]arry) {
		int sum = 0;
		
		for (int i = 0; i < arry.length; i++) {
			sum += arry[i];
		}
		
		
		return sum;
	}
	
	
	
	public static int averge(int[]arry) {
		int sum = 0;
		
		for (int i = 0; i < arry.length; i++) {
			sum += arry[i];
		}
		
		
		return (sum/arry.length);
	}
	
	
	
}
