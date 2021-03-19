package test_relationship;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaTestRelationshipProject");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		// ManyToOne
//		Department dept1 = new Department(1, "Test Department");
//		Teacher t1 = new Teacher(1, "Mike", 60000, dept1);
//		Teacher t2 = new Teacher(2, "Bairon", 80000, dept1);
//		
//		em.persist(dept1);
//		em.persist(t1);
//		em.persist(t2);
		
		// OneToMany
		Teacher t1 = new Teacher(1, "Mike", 60000);
		Teacher t2 = new Teacher(2, "Bairon", 80000);
		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList.add(t1);
		teacherList.add(t2);
		
		Department dept1 = new Department(1, "Test Department", teacherList);
		
		em.persist(t1);
		em.persist(t2);
		em.persist(dept1);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
