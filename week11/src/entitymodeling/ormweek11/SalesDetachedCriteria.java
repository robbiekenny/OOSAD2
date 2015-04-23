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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SalesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression numSales;
	public final DoubleExpression profit;
	public final DoubleExpression expenses;
	
	public SalesDetachedCriteria() {
		super(entitymodeling.ormweek11.Sales.class, entitymodeling.ormweek11.SalesCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		numSales = new IntegerExpression("numSales", this.getDetachedCriteria());
		profit = new DoubleExpression("profit", this.getDetachedCriteria());
		expenses = new DoubleExpression("expenses", this.getDetachedCriteria());
	}
	
	public SalesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entitymodeling.ormweek11.SalesCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		numSales = new IntegerExpression("numSales", this.getDetachedCriteria());
		profit = new DoubleExpression("profit", this.getDetachedCriteria());
		expenses = new DoubleExpression("expenses", this.getDetachedCriteria());
	}
	
	public Sales uniqueSales(PersistentSession session) {
		return (Sales) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sales[] listSales(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sales[]) list.toArray(new Sales[list.size()]);
	}
}

