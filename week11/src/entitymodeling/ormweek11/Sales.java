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

public class Sales {
	public Sales() {
	}
	
	private int ID;
	
	private int numSales;
	
	private double profit;
	
	private double expenses;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNumSales(int value) {
		this.numSales = value;
	}
	
	public int getNumSales() {
		return numSales;
	}
	
	public void setProfit(double value) {
		this.profit = value;
	}
	
	public double getProfit() {
		return profit;
	}
	
	public void setExpenses(double value) {
		this.expenses = value;
	}
	
	public double getExpenses() {
		return expenses;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
