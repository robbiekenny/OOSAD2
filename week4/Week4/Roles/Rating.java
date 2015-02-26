package Week4.Roles;

public class Rating extends Qualification {

	private int flightTime;
	private int altFlightTime;

public Rating(String n,int f)
{
super(n);
flightTime = f;
}

	public int getFlightTime() {
		return this.flightTime;
	}

	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}

	public int getAltFlightTime() {
		return this.altFlightTime;
	}

	public void setAltFlightTime(int altFlightTime) {
		this.altFlightTime = altFlightTime;
	}

}
