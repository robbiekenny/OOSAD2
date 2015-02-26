package Week4.Roles;

import java.util.*;

public class Driver {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

Degree d = new Degree("Teaching",8);
Degree d2 = new Degree("Child care",6);

ArrayList<Degree> degrees = new ArrayList<Degree>();
degrees.add(d);
degrees.add(d2);
		 Teacher t = new Teacher("Robbie",21,"St.Marks",degrees);
		t.printDetails();
	}

}
