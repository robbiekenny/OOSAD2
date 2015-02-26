package Week4.Roles;

public class Specialisation extends Qualification {

	private String area;

public Specialisation(String n,String a)
{
super(n);
area = a;
}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
