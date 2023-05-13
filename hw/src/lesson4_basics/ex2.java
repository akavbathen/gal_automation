package lesson4_basics;

public class ex2 {

	public static void main(String[] args) {
		
		Cat[]myCats = new Cat[5];
		
		myCats[0] = new Cat(3, "pizi", "pink");
		myCats[1] = new Cat(2, "boli", "brown");
		myCats[2] = new Cat(4, "goli", "white");
		myCats[3] = new Cat(7, "moli", "black");
		myCats[4] = new Cat(8, "poli", "blue");
		
		for (int i = 0; i < myCats.length; i++) {
			System.out.println(myCats[i]);
		}
		

	}
	
	
}
