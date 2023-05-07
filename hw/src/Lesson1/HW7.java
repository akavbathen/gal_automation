package Lesson1;

public class HW7 {

	public static void main(String[] args) {
		
		double radius = 2.5;
		float pi = (float)3.14;
		double hightRect = 3;
		double widthRect = 4;
		
		double sCircle = pi * (int)Math.pow(radius, 2);
		System.out.println(sCircle);
		
		double rRect = hightRect * widthRect;
		System.out.println(rRect);
		
		double sumCircleRect = rRect + sCircle;
		System.out.println(sumCircleRect);
				
	}

}
