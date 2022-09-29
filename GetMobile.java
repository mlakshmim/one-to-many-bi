package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetMobile {

	public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
      EntityManager entityManager=entityManagerFactory.createEntityManager();
      EntityTransaction entityTransaction=entityManager.getTransaction();
      Mobile m=entityManager.find(Mobile.class, 1);
      
      System.out.println("---------Mobile_Info--------");
      System.out.println("Mobile id:"+m.getId());
      System.out.println("Mobile name:"+m.getName());
      System.out.println("Mobile Cost:"+m.getCost());
      System.out.println("_________________________________");
      
      List<Sim> sim=m.getSim();
//      System.out.println("---------Sim1_Info---------");
//      System.out.println(sim.get(0));
//      System.out.println("-------Sim2_info------");
//      System.out.println(sim.get(1));
      for(Sim s:sim) {
    	  System.out.println("-----Sim_Info");
    	  System.out.println("Sim id:"+s.getId());
    	  System.out.println("Sim name:"+s.getName());
    	  System.out.println("Sim provider:"+s.getProvider());
    	  System.out.println("-------------------------------");
      }
	}

}
