package Arrays;

public class ex3 {

	public static void main(String[] args) {
		int[]numbers = { 11, 33, 54, 67, 80 };
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]== 80) {
				System.out.println("numbers " + numbers[i]+ " existing");
			}
		}
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum=sum+numbers[i];
			
		}
		double Average = sum/numbers.length;
		System.out.println(Average);
	}

}
