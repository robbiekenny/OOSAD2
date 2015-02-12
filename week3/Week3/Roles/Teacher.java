package Week3.Roles;

import java.util.*;

public class Teacher extends Professional {

	protected Collection<Module> teachesOn;
	protected Collection<Degree> obtained;
	private String schoolName;
	private String teachingLevel;

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getTeachingLevel() {
		return this.teachingLevel;
	}

	public void setTeachingLevel(String teachingLevel) {
		this.teachingLevel = teachingLevel;
	}

	public void printDetails()
{
System.out.println(getName() + " teaches at " + schoolName);
}

}
