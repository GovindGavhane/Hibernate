package com.jsp.controller;

import com.jsp.dao.ItemDao;
import com.jsp.dto.Item;

public class SaveItem {

	public static void main(String[] args) {
		 
		ItemDao dao = new ItemDao();
		Item item = new Item();
		item.setName("bandege");
		item.setCost(259);
		item.setQuatity("6");
		Item i =dao.saveItem(item, 1);
		if(i!=null)
		{
			System.out.println("Item saved successfully");
		}
	}

}
