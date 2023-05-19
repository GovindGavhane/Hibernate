package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Item;
import com.jsp.dto.MedOder;

public class ItemDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	
	public Item saveItem(Item item , int medoder_id)
	{
		EntityTransaction trasaction = manager.getTransaction();
		trasaction.begin();
		MedOder medoder = manager.find(MedOder.class, medoder_id);
		List<Item> items = medoder.getItems();
		items.add(item);
		medoder.setItems(items);
		item.setMedoder(medoder);
		manager.persist(item);
		manager.merge(medoder);
		trasaction.commit();
		return item;
	}

}
