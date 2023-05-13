package lesson4_medum;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Name of browser");
		String browser = name.nextLine();
		browser = browser.toLowerCase();
		

		if (browser.equals("firefox")) {
			System.out.print(browser + " blue");
		}	
		else if (browser.equals("chrome")) {
			System.out.print(browser + " red");	
		}
		else if (browser.equals("edge")) {
			System.out.print(browser + " yellow");
		}	
			
		else {
			System.out.print(browser + " green");
		}	
	}

}
