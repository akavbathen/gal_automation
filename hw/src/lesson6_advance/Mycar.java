package lesson6_advance;

public class Mycar {

	public static void main(String[] args) {
		
		Station[] stations = new Station[3];
		stations[0] = new Station("GLGL", 99.9);
		stations[1] = new Station("blbl", 100.0);
		stations[2] = new Station("alal", 98.4);
		
		
		Radio radio = new Radio(stations, true, 2);
		Automobile auto = new Automobile("red", 10.5, 1980, "suzuki", radio);

	}

}
