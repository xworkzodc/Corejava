package com.sachin.datastore;

import java.util.TreeSet;

import com.sachin.datastore.dao.KitchenItemDAO;
import com.sachin.datastore.dao.KitchenItemDAOImpl;
import com.sachin.datastore.dto.KitchenItemDTO;

public class KitchenItemDAOTester {

	public static void main(String[] args) {

		KitchenItemDTO item1 = new KitchenItemDTO("xpresso", 100, "coffee perculator", "stainless Steel");
		KitchenItemDTO item2 = new KitchenItemDTO("Cooker", 2190, "cook", "ceramic");

		KitchenItemDAO dao = new KitchenItemDAOImpl();
		TreeSet<KitchenItemDTO> treeSet = new TreeSet<KitchenItemDTO>();

		dao.saveUnique(item1);
		dao.saveUnique(item2);

		System.out.println(dao.findAllSortbyUsedFor());

	}

}
