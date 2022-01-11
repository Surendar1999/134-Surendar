package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Teacher;

public class AppTeacher {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("jbd-pu");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Teacher teacher = new Teacher();
			teacher.setname("Ramu");
			teacher.setsubject("Computer science");
			teacher.setdegree("MSC");

			entityManager.persist(teacher);

			transaction.commit();
		
			Query q = entityManager.createQuery("select t from tea t");

			List<Teacher> resultList = q.getResultList();
			System.out.println("num of sudents:" + resultList.size());
			for (Teacher next : resultList) {
				System.out.println("next student: " + next);
			}

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			entityManager.close();
			emf.close();
		}
	}

}
