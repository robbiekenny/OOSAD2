package Week3.Roles;

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

public void printDetails()
{
System.out.println(getName() + " has served at " + base + " for " + yearsOfService);
}

}
