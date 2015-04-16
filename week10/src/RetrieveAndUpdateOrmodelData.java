/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
public class RetrieveAndUpdateOrmodelData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = OrmodelPersistentManager.instance().getSession().beginTransaction();
		try {
			Employee employee = Employee.loadEmployeeByQuery("id = 14", null);
			// Update the properties of the persistent object
			employee.setName("Robbie");
			employee.setMobile("087222Sxc");
			employee.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		EmployeeCriteria employeeCriteria = new EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//employeeCriteria.id.eq();
		System.out.println(employeeCriteria.uniqueEmployee());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOrmodelData retrieveAndUpdateOrmodelData = new RetrieveAndUpdateOrmodelData();
			try {
				retrieveAndUpdateOrmodelData.retrieveAndUpdateTestData();
				//retrieveAndUpdateOrmodelData.retrieveByCriteria();
			}
			finally {
				OrmodelPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
