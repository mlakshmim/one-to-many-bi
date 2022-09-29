package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveFood {

	public static void main(String[] args) {
       FoodOrder f=new FoodOrder();
       f.setName("Lakshmi");
       f.setStatus("Prepareing");
       
       Items i=new Items();
       i.setName("Burger");
       i.setQuantity(2);
       i.setCost(90.00);
       
       Items i1=new Items();
       i1.setName("French_Fries");
       i1.setQuantity(1);
       i1.setCost(75.00);
       
       Items i2=new Items();
       i2.setName("Pizza");
       i2.setQuantity(1);
       i2.setCost(250.00);
       
       List<Items> l=new ArrayList();
       l.add(i);
       l.add(i1);
       l.add(i2);
       
       f.setItems(l);
       
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction=entityManager.getTransaction();
       
       entityTransaction.begin();
       entityManager.persist(f);
       entityManager.persist(i);
       entityManager.persist(i1);
       entityManager.persist(i2);
       entityTransaction.commit();
       
       
       
	}

}
