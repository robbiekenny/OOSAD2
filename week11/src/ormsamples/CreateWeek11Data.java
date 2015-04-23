/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateWeek11Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession().beginTransaction();
		try {
			entitymodeling.ormweek11.Employee entityModelingormWeek11Employee = entitymodeling.ormweek11.EmployeeDAO.createEmployee();
			entityModelingormWeek11Employee.setName("Jim Bob");
			entityModelingormWeek11Employee.setAddress("123 Fake Street");
			entityModelingormWeek11Employee.setMobile("09797689");
			entityModelingormWeek11Employee.setPps("876868P0");
			entityModelingormWeek11Employee.setSalary(89786);
			entityModelingormWeek11Employee.setYearsExperience(1);
			entitymodeling.ormweek11.EmployeeDAO.save(entityModelingormWeek11Employee);
			entitymodeling.ormweek11.Sales entityModelingormWeek11Sales = entitymodeling.ormweek11.SalesDAO.createSales();
			entityModelingormWeek11Sales.setNumSales(15000);
			entityModelingormWeek11Sales.setExpenses(30000);
			entityModelingormWeek11Sales.setProfit(45000);
			entitymodeling.ormweek11.SalesDAO.save(entityModelingormWeek11Sales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateWeek11Data createWeek11Data = new CreateWeek11Data();
			try {
				createWeek11Data.createTestData();
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
