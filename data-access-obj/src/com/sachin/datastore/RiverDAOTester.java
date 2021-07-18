package com.sachin.datastore;

import com.sachin.datastore.dao.RiverDAO;
import com.sachin.datastore.dao.RiverDAOImpl;
import com.sachin.datastore.dto.RiverDTO;

public class RiverDAOTester {

	public static void main(String[] args)  {
		RiverDTO dto=new RiverDTO("Tungabhadra", "Koodli", 531, 2, true);
		RiverDTO dto1=new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);
		
		RiverDAO dao=new RiverDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		System.out.println(dao.totalItems());
		
		RiverDTO tungabhadraUpdate=new RiverDTO("Tungabhadra", "Koodli", 580, 2, true);
		dao.update(tungabhadraUpdate);
		
		System.out.println("total irems "+dao.totalItems());
		
		RiverDTO dtoToDelete=new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);
		dao.delete(dtoToDelete);
		
		System.out.println("total items "+dao.totalItems());
		
	}
	
	

}
