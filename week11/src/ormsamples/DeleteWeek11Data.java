/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteWeek11Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession().beginTransaction();
		try {
			entitymodeling.ormweek11.Employee entityModelingormWeek11Employee = entitymodeling.ormweek11.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Delete the persistent object
			entitymodeling.ormweek11.EmployeeDAO.delete(entityModelingormWeek11Employee);
			entitymodeling.ormweek11.Sales entityModelingormWeek11Sales = entitymodeling.ormweek11.SalesDAO.loadSalesByQuery(null, null);
			// Delete the persistent object
			entitymodeling.ormweek11.SalesDAO.delete(entityModelingormWeek11Sales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteWeek11Data deleteWeek11Data = new DeleteWeek11Data();
			try {
				deleteWeek11Data.deleteTestData();
			}
			finally {
				entitymodeling.ormweek11.Week11PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
