package com.sachin.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sachin.datastore.dto.KitchenItemDTO;

public class KitchenItemDAOImpl implements KitchenItemDAO {

	private List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>();

	@Override
	public boolean saveUnique(KitchenItemDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortbyUsedFor() {
		Collection<KitchenItemDTO> tempCollection = new ArrayList<KitchenItemDTO>();
		Iterator<KitchenItemDTO> allocation = this.list.iterator();
		while (allocation.hasNext()) {
			KitchenItemDTO sortbyUsedFor = allocation.next();

			tempCollection.add(sortbyUsedFor);
		}
		return tempCollection;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortbyUsedForDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortbyName() {
		Object temp;
		// Collection.sort(temp);
		System.out.println("Sorted by name");
		// for (int i = 0; i < ((Collection<KitchenItemDTO>) temp).size(); i++)
		// System.out.println(((Object) temp).get(i));
		// return temp;
		return list;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortbyPriceDesc() {
		// TODO Auto-generated method stub
		return null;
	}

}
