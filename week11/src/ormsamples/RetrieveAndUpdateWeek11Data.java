/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateWeek11Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession().beginTransaction();
		try {
			entitymodeling.ormweek11.Employee entityModelingormWeek11Employee = entitymodeling.ormweek11.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			entitymodeling.ormweek11.EmployeeDAO.save(entityModelingormWeek11Employee);
			entitymodeling.ormweek11.Sales entityModelingormWeek11Sales = entitymodeling.ormweek11.SalesDAO.loadSalesByQuery(null, null);
			// Update the properties of the persistent object
			entitymodeling.ormweek11.SalesDAO.save(entityModelingormWeek11Sales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		entitymodeling.ormweek11.EmployeeCriteria entityModelingormWeek11EmployeeCriteria = new entitymodeling.ormweek11.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//entityModelingormWeek11EmployeeCriteria.ID.eq();
		System.out.println(entityModelingormWeek11EmployeeCriteria.uniqueEmployee());
		
		System.out.println("Retrieving Sales by SalesCriteria");
		entitymodeling.ormweek11.SalesCriteria entityModelingormWeek11SalesCriteria = new entitymodeling.ormweek11.SalesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//entityModelingormWeek11SalesCriteria.ID.eq();
		System.out.println(entityModelingormWeek11SalesCriteria.uniqueSales());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateWeek11Data retrieveAndUpdateWeek11Data = new RetrieveAndUpdateWeek11Data();
			try {
				retrieveAndUpdateWeek11Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateWeek11Data.retrieveByCriteria();
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
