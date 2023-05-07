package Lesson3_medum;

public class ex2 {

	public static void main(String[] args) {
		
		int[]Numbers = {10,8,9,2,14,22,4,3,7,4};
		
		System.out.println(miniNumber(Numbers));

	}
	public static int miniNumber(int[]ArryNumber) {
		int mini = 9999;
		
		for (int i = 0; i < ArryNumber.length; i++) {
			
			if (mini > ArryNumber[i]) {
				mini = ArryNumber[i];
			}
		
		}
		
		return mini;
		
		
		
		
	}
	
}
