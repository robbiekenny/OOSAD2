/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
public class ListOrmodelData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		Employee[] employees = Employee.listEmployeeByQuery(null, null);
		int length = Math.min(employees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		EmployeeCriteria employeeCriteria = new EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//employeeCriteria.id.eq();
		employeeCriteria.setMaxResults(ROW_COUNT);
		Employee[] employees = employeeCriteria.listEmployee();
		int length =employees== null ? 0 : Math.min(employees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(employees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOrmodelData listOrmodelData = new ListOrmodelData();
			try {
				listOrmodelData.listTestData();
				//listOrmodelData.listByCriteria();
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
