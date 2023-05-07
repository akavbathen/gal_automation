package Lesson3_medum;

public class ex3 {

	public static void main(String[] args) {
		
		int[]numners = {10,2,8,3,4,6,7,6,4,12};
		int number = 7;
		System.out.println(searchValue(number, numners));
		
	}
	
	public static boolean searchValue(int value,int[]arry1){
		boolean exists = false;
		
		for (int i = 0; i < arry1.length; i++) {
			if (arry1[i] == value) {
				exists = true;
			}
				
		}
		return exists;
		
		
		
		
	}
	
}
