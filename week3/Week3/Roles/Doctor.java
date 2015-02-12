package Week3.Roles;

public class Doctor extends Professional {

	private String hospitalName;
	private String ward;

	public String getHospitalName() {
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getWard() {
		return this.ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

public void printDetails()
{
System.out.println(getName() + " works at " + hospitalName + " in " + ward);
}

}
