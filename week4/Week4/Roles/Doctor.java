package Week4.Roles;

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

public Doctor(String n,int ag,String hos,String w)
{
super(n,ag);
hospitalName = hos;
ward = w;
}

	public void printDetails() {
		System.out.println(getName() + " is a doctor at " + hospitalName + " in the " + ward + " ward");
	}

}
