package lesson4_basics;

public class Ex1_3 {

	public static void main(String[] args) {
		
		Cat alfi = new Cat(10, "Alfi", "brown");
		Cat pizi = new Cat(2,"pizi","white"); 
		
		System.out.println(alfi.getColor() + " " + alfi.getName());
		System.out.println(pizi.getColor()+ " "+ pizi.getName());
		
		System.out.println(alfi.toString());
		System.out.println(pizi.toString());
	}

}
