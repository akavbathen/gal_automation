package Loops;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter your grade:");
		int grade = cs.nextInt();

			if (grade < 55) {
				System.out.println("Failed");

			}else if (grade > 90) {
				System.out.println("Excellent");
			}
			
	

		}

	}


