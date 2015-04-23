/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package entitymodeling.ormweek11;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EmployeeDAO {
	public static Employee loadEmployeeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return loadEmployeeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return getEmployeeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return loadEmployeeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return getEmployeeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Employee) session.load(entitymodeling.ormweek11.Employee.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Employee) session.get(entitymodeling.ormweek11.Employee.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employee) session.load(entitymodeling.ormweek11.Employee.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employee) session.get(entitymodeling.ormweek11.Employee.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return queryEmployee(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return queryEmployee(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return listEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return listEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entitymodeling.ormweek11.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entitymodeling.ormweek11.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employee", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmployee(session, condition, orderBy);
			return (Employee[]) list.toArray(new Employee[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmployee(session, condition, orderBy, lockMode);
			return (Employee[]) list.toArray(new Employee[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return loadEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return loadEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Employee[] employees = listEmployeeByQuery(session, condition, orderBy);
		if (employees != null && employees.length > 0)
			return employees[0];
		else
			return null;
	}
	
	public static Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Employee[] employees = listEmployeeByQuery(session, condition, orderBy, lockMode);
		if (employees != null && employees.length > 0)
			return employees[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return iterateEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entitymodeling.ormweek11.Week11PersistentManager.instance().getSession();
			return iterateEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entitymodeling.ormweek11.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entitymodeling.ormweek11.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employee", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee createEmployee() {
		return new entitymodeling.ormweek11.Employee();
	}
	
	public static boolean save(entitymodeling.ormweek11.Employee employee) throws PersistentException {
		try {
			entitymodeling.ormweek11.Week11PersistentManager.instance().saveObject(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(entitymodeling.ormweek11.Employee employee) throws PersistentException {
		try {
			entitymodeling.ormweek11.Week11PersistentManager.instance().deleteObject(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(entitymodeling.ormweek11.Employee employee) throws PersistentException {
		try {
			entitymodeling.ormweek11.Week11PersistentManager.instance().getSession().refresh(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(entitymodeling.ormweek11.Employee employee) throws PersistentException {
		try {
			entitymodeling.ormweek11.Week11PersistentManager.instance().getSession().evict(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByCriteria(EmployeeCriteria employeeCriteria) {
		Employee[] employees = listEmployeeByCriteria(employeeCriteria);
		if(employees == null || employees.length == 0) {
			return null;
		}
		return employees[0];
	}
	
	public static Employee[] listEmployeeByCriteria(EmployeeCriteria employeeCriteria) {
		return employeeCriteria.listEmployee();
	}
}
