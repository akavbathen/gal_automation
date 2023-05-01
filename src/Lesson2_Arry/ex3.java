package Lesson2_Arry;

public class ex3 {

	public static void main(String[] args) {
		
		double[]numbers = new double[5];
		
		numbers[0] = 5;
		numbers[1] = 4;
		numbers[2] = 7;
		numbers[3] = 10;
		numbers[4] = 15;
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		
		}
		System.out.print(sum);
		
	}

}
