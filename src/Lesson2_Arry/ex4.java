package Lesson2_Arry;

public class ex4 {

	public static void main(String[] args) {
		double[]numbers = new double[5];
		
		numbers[0]= 20;
		numbers[1]= 45;
		numbers[2]= 65.5;
		numbers[3]= 3;
		numbers[4]= 10;

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			
			
		}
		double average = sum/numbers.length;
		System.out.print(average);
	}

}
