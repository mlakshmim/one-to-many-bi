package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDriver {

	public static void main(String[] args) {
         Mobile m=new Mobile();
         m.setName("Redmi");
         m.setCost(1550);
         
         Sim s=new Sim();
         s.setName("Jio sim3");
         s.setProvider("Jio");
         
         Sim s1=new Sim();
         s1.setName("Docomo sim4");
         s1.setProvider("Docomo");
         
         List<Sim> ls=new ArrayList();
         ls.add(s);
         ls.add(s1);
         
        // m.setSim(ls);
         s.setMobile(m );
         
         EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
         EntityManager entityManager=entityManagerFactory.createEntityManager();
         EntityTransaction entityTransaction=entityManager.getTransaction();
         
         entityTransaction.begin();
         entityManager.persist(m);
         entityManager.persist(s);
         entityManager.persist(s1);
         entityTransaction.commit();
         
	}

}
