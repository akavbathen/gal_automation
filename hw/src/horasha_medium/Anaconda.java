package horasha_medium;

public class Anaconda  extends Snake{
	
	private int Legs;
	
	public Anaconda(String name, String color, int legs) {
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

	