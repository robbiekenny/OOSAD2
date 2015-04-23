/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package entitymodeling.ormweek11;

public class Employee {
	public Employee() {
	}
	
	private int ID;
	
	private String name;
	
	private String address;
	
	private String pps;
	
	private String mobile;
	
	private double salary;
	
	private int yearsExperience;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPps(String value) {
		this.pps = value;
	}
	
	public String getPps() {
		return pps;
	}
	
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setSalary(double value) {
		this.salary = value;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setYearsExperience(int value) {
		this.yearsExperience = value;
	}
	
	public int getYearsExperience() {
		return yearsExperience;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
