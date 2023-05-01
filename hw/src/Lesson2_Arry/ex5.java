package Lesson2_Arry;

public class ex5 {

	public static void main(String[] args) {
		double[]numbers = new double[5];
		
		numbers[0]= 30;
		numbers[1]= 6;
		numbers[2]= 24;
		numbers[3]= 10;
		numbers[4]= 13;
		
		double number;
		
		number = 999;

		for (int i = 0; i < numbers.length; i++) {
			
			
			if (numbers[i]<number) {
				
				number = numbers[i];
			}
			
				
		}
		System.out.println(number);
	}

}
