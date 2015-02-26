package Week4.Roles;

public class Pilot extends Professional {

	private String base;
	private String yearsOfService;

	public String getBase() {
		return this.base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getYearsOfService() {
		return this.yearsOfService;
	}

	public void setYearsOfService(String yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

public Pilot(String n,int ag,String b,String ye)
{
super(n,ag);
base = b;
yearsOfService = ye;
}

	public void printDetails() {
		System.out.println(getName() + " has been a pilot at " + base + " for " + yearsOfService + " years");
	}

}
