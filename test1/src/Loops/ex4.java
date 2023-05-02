package Loops;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter your grade:");
		int grade = cs.nextInt();

		while (grade != -1) {

			if (grade < 55) {
				System.out.println("Failed");

			}else if (grade > 90) {
				System.out.println("Excellent");
			}
			
			System.out.println("Enter your grade:");
			grade = cs.nextInt();

		}


	}

}
