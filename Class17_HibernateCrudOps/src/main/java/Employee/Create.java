package Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import net.roseindia.model.*;

public class Create {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpName("uts");
		emp.setEmpMobileNos("000000");
		emp.setEmpAddress("Delhi - India");
		session.save(emp);
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
	}
	
}

