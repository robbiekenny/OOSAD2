/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
import java.util.Random;
public class CreateOrmodelData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = OrmodelPersistentManager.instance().getSession().beginTransaction();
		try {
			Random randomGenerator = new Random();
    
      			
			String[] add = {"234 whitebrook park",
			"kilnamanagh","Kiimage","Tymon North","Springfield","Kingswood",
			"Belgard","Fettercairn","Rossfield","Jobstown"};
			String[] names = {
			"Derek",
			"Conor","Eoin","Karl","Jonhnny","Robert","Killian","Brooke","Alesha","Paul"};
			for(int i = 0; i < 10; i++)
			{
				int randomInt = randomGenerator.nextInt(1000000);
				int randomInt2 = randomGenerator.nextInt(1000000);
				Employee employee = Employee.createEmployee();
				// Initialize the properties of the persistent object here
				employee.setName(names[i]);
				employee.setAddress(add[i]);
				employee.setPps("" + randomInt);
				employee.setMobile("" + randomInt2);
				employee.save();
				
			}
			t.commit();
			
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmodelData createOrmodelData = new CreateOrmodelData();
			try {
				createOrmodelData.createTestData();
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
