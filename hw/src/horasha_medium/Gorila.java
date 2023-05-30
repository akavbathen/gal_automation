package horasha_medium;

public class Gorila extends Monkey {

	private int Legs;
	

	public Gorila(String name, String color, int legs) {
		super(name, color);
		this.Legs = legs;
	}
	
	public int getLegs() {
		return this.Legs;
	}

	public void setLegs(int legs) {
		this.Legs = legs;
	}

	@Override
	public void howManyLegs() {

		System.out.println(this.Legs);
}

}