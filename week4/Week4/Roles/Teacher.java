package Week4.Roles;

import java.util.*;

public class Teacher extends Professional {

	private String schoolName;
	private String teachingLevel;
	protected Collection<Module> teachesOn;
	protected ArrayList<Degree> obtained;

	public Teacher(String n,int ag,String skool,ArrayList<Degree> ob)
	{
		super(n,ag);
		schoolName = skool;
obtained = ob;
		
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	//public void setSchoolName(String schoolName) {
	//	this.schoolName = schoolName;
	//}

	public String getTeachingLevel() {
		return this.teachingLevel;
	}

	//public void setTeachingLevel(String teachingLevel) {
	//	this.teachingLevel = teachingLevel;
//	}

	public void printDetails() {
		System.out.println(getName() + " teaches at " + schoolName);
for(int i = 0; i < obtained.size(); i++)
{
System.out.println(obtained.get(i).getName() + " level " + obtained.get(i).getLevel());
}
		
	}

}
