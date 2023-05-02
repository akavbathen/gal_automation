package Conditions;

public class ex3 {

	public static void main(String[] args) {
		double num1 = 8;
		double num2= 4;
		double num3 = 21;
		
		double max = 0;
		if(num1>num2) {
			max = num1;
		}else {
			max = num2;
		}
		
		if (max<num3) {
			max = num3;
			
		}
		
		System.out.print(max);
	}

}
