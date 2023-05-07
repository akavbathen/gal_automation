package Lesson3_medum;

public class ex1 {

	public static void main(String[] args) {
		
		System.out.println(MinimumNumber(4, 2, 8));

	}
	public static int MinimumNumber(int number1,int number2,int number3) {
		
		int mini = number1;
		
		if (mini > number2){
			mini = number2;
		if (mini > number3) {
			mini = number3;
		}	
					
		}
		
		return(mini);
	}
}
