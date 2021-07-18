package com.sachin.datastore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.sachin.datastore.dao.TempleDAO;
import com.sachin.datastore.dao.TempleDAOImpl;
import com.sachin.datastore.dto.TempleDTO;

public class TempleDAOTester {

	public static void main(String[] args) {
		TempleDTO t1 = new TempleDTO(1, "ganesha temple", "Honnali", 0, false, 2, true, "Ganesha", false);
		TempleDTO t2 = new TempleDTO(2, "Chamundeshwari temple", "Mysore", 0, true, 10, true, "chamundeshwari", true);
		TempleDTO t3 = new TempleDTO(3, "hanuman temple", "banaglore", 100, true, 10, true, "hanuman", true);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(t1);
		dao.save(t2);
		dao.save(t3);
		System.out.println(dao.totalItems());

		dao.delete(t2);

		System.out.println("total items " + dao.totalItems());

		System.out.println("------------------------------------");
		
		System.out.println("first item " + dao.findFirstItem());

		System.out.println("------------------------------------");
		System.out.println("last item " + dao.findLastItem());

		System.out.println("------------------------------------");
		System.out.println(dao.findByName("hanuman temple"));

		System.out.println("------------------------------------");
		System.out.println(dao.findByLocation("Honnali"));

		System.out.println("------------------------------------");
		System.out.println(dao.findByLocationAndName("Mysore", "chamundeshwari temple"));

		System.out.println("------------------------------------");
		Collection<TempleDTO> all=dao.findAll();
		for (TempleDTO templeDTO : all) {
			System.out.println(templeDTO);
		}

		System.out.println("------------------------------------");
		Collection<TempleDTO> loc=dao.findAllTempleByLocationStartWith('H');
		for (TempleDTO templeDTO : loc) {
			System.out.println('H');
			System.out.println(templeDTO);
		}
		
		System.out.println("------------------------------------");
		Collection<TempleDTO> cost=dao.findAllTempleByEntryFeeGreaterThan(50);
		for (TempleDTO templeDTO : cost) {
			System.out.println(templeDTO);
		}
		
		System.out.println("------------------------------------");
		Collection<TempleDTO> noOfpoojari=dao.findAllTempleByNoOfPoojarisGreaterThan(6);
		for (TempleDTO templeDTO : noOfpoojari) {
			System.out.println(templeDTO);
		}
		
		System.out.println("------------------------------------");
		Collection<String> allLoc=dao.findAllLocations();
		for (String string : allLoc) {
			System.out.println(string);
		}
		
		System.out.println("------------------------------------");
		dao.findLocationByName("hanuman temple");
		
	}

}
