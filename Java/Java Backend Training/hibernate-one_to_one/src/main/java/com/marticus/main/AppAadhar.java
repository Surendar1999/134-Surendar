package com.marticus.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Aadhar;
import com.marticus.dao.Student;
import com.marticus.util.HibernateUtil;

public class AppAadhar {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Aadhar aadhar1 = new Aadhar("264512365");
			Aadhar aadhar2 = new Aadhar("25467456");
			Person person1 = new Person("kumar", aadhar1);
			Person person2 = new Person("rajesh", aadhar2);
			session.save(person1);
			session.save(person2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
