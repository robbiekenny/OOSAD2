/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListWeek11Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		entitymodeling.ormweek11.Employee[] entityModelingormWeek11Employees = entitymodeling.ormweek11.EmployeeDAO.listEmployeeByQuery(null, null);
		int length = Math.min(entityModelingormWeek11Employees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityModelingormWeek11Employees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sales...");
		entitymodeling.ormweek11.Sales[] entityModelingormWeek11Saleses = entitymodeling.ormweek11.SalesDAO.listSalesByQuery(null, null);
		length = Math.min(entityModelingormWeek11Saleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityModelingormWeek11Saleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		entitymodeling.ormweek11.EmployeeCriteria entityModelingormWeek11EmployeeCriteria = new entitymodeling.ormweek11.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//entityModelingormWeek11EmployeeCriteria.ID.eq();
		entityModelingormWeek11EmployeeCriteria.setMaxResults(ROW_COUNT);
		entitymodeling.ormweek11.Employee[] entityModelingormWeek11Employees = entityModelingormWeek11EmployeeCriteria.listEmployee();
		int length =entityModelingormWeek11Employees== null ? 0 : Math.min(entityModelingormWeek11Employees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityModelingormWeek11Employees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
		System.out.println("Listing Sales by Criteria...");
		entitymodeling.ormweek11.SalesCriteria entityModelingormWeek11SalesCriteria = new entitymodeling.ormweek11.SalesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//entityModelingormWeek11SalesCriteria.ID.eq();
		entityModelingormWeek11SalesCriteria.setMaxResults(ROW_COUNT);
		entitymodeling.ormweek11.Sales[] entityModelingormWeek11Saleses = entityModelingormWeek11SalesCriteria.listSales();
		length =entityModelingormWeek11Saleses== null ? 0 : Math.min(entityModelingormWeek11Saleses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityModelingormWeek11Saleses[i]);
		}
		System.out.println(length + " Sales record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListWeek11Data listWeek11Data = new ListWeek11Data();
			try {
				listWeek11Data.listTestData();
				//listWeek11Data.listByCriteria();
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
