package lesson6_medim;

public class My_Taishs {

	public static void main(String[] args) {
		
		Beard one = new Beard("purple",14);
		Tail t = new Tail(true, "whit");
		
		Leg[]legs = new Leg[4];
		legs[0] = new Leg(2);
		legs[1] = new Leg(2.5);
		legs[2] = new Leg(5);
		legs[3] = new Leg(3);
		
		Taish taish1 = new Taish(14, 20, "wellow", one, legs, t);
		
		System.out.println(taish1.getBeard().getColor());
		System.out.println(taish1.toString());
		System.out.println(taish1.getTail().isBig());
		
		
		
		Beard two = new Beard("white", 10.4);
		Tail tt = new Tail(false, "green");
		
		Leg[]legs2 = new Leg[4]; 
		legs[0] = new Leg(2);
		legs[1] = new Leg(2.5);
		legs[2] = new Leg(5);
		legs[2] = new Leg(3);
		
		Taish taish2 = new Taish(20,30,"blue", two, legs, tt);
		
		//System.out.print(taish2.getBeard().getColor());
		//System.out.print(taish2.toString());
		System.out.print(taish2.getTail().isBig());
		
		
		
		
		


	}

}
