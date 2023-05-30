package lesson6_advance;

public class Radio {
	
	private Station[] station;
	private boolean status;
	private int currenStation;
	
	public Radio(Station[] station, boolean status, int currenStation) {
		
		super();
		this.station = station;
		this.status = status;
		this.currenStation= currenStation;
	}

	public Station[] getStation() {
		return station;
	}

	public void setStation(Station[] station) {
		this.station = station;
	}

	public boolean isOn() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCurrenStation() {
		return currenStation;
	}

	public void setCurrenStation(int currenStation) {
		this.currenStation = currenStation;
	}
	


}
