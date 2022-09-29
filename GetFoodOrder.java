package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetFoodOrder {

	public static void main(String[] args) {
      
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		FoodOrder f=entityManager.find(FoodOrder.class, 1);
		
		System.out.println("--------Food_details--------");
		System.out.println("FoodOrder id:"+f.getId());
		System.out.println("FoodOrder To:"+f.getName());
		System.out.println("FoodOrder status:"+f.getStatus());
		System.out.println("------------------------------");
		
		List<Items> items=f.getItems();
		System.out.println("--------Orderd_Items_are----------");
		System.out.println(items.get(0));
		System.out.println(items.get(1));
		System.out.println(items.get(2));
	}
	
}
