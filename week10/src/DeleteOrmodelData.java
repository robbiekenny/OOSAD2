/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
public class DeleteOrmodelData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = OrmodelPersistentManager.instance().getSession().beginTransaction();
		try {
			Employee employee = Employee.loadEmployeeByQuery("id=4", null);
			employee.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOrmodelData deleteOrmodelData = new DeleteOrmodelData();
			try {
				deleteOrmodelData.deleteTestData();
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
