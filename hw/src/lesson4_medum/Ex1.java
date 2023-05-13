package lesson4_medum;

public class Ex1 {

	public static void main(String[] args) {
		
		Circle circle  = new Circle("white", 5);
		Rectangle rectangle = new Rectangle("grey", 4, 2);
		
		System.out.println(circle.getColor());
		System.out.println(circle.calcAreaCircle());
		
		System.out.println(rectangle.getColor());
		System.out.println(Rectangle.calcAreaRectangle());

	}

}
