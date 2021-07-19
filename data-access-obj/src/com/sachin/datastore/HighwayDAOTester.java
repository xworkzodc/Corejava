package com.sachin.datastore;

import java.util.Collection;

import com.sachin.datastore.constant.HighwayType;
import com.sachin.datastore.dao.HighwayDAO;
import com.sachin.datastore.dao.HighwayDAOImpl;
import com.sachin.datastore.dto.HighwayDTO;

public class HighwayDAOTester {

	public static void main(String[] args) {
		HighwayDTO highway1 = new HighwayDTO(1, 44, HighwayType.NATIONAL_HIGHWAY, "Jammu and kashmir", 3745, true,
				"A B company");
		HighwayDTO highway2 = new HighwayDTO(2, 01, HighwayType.STATE_HIGHWAY, "Karnataka", 178.08, false,
				"S S company");
		HighwayDTO highway3 = new HighwayDTO(3, 10, HighwayType.STATE_HIGHWAY, "Karnataka", 139.10, false,
				"S S company");
		HighwayDTO highway4 = new HighwayDTO(4, 111, HighwayType.NATIONAL_HIGHWAY, "Karnataka", 100, false,
				"A B company");

		HighwayDAO dao = new HighwayDAOImpl();
		dao.save(highway4);
		dao.save(highway3);
		dao.save(highway2);
		dao.save(highway1);

		System.out.println(dao.totalItems());

		System.out.println("------------------------------------");
		Collection<HighwayDTO> all = dao.findAll();
		for (HighwayDTO highwayDTO : all) {
			System.out.println(highwayDTO);
		}

		System.out.println("------------------------------------");
		Collection<Integer> allNum = dao.findAllNumber();
		for (int number : allNum) {
			System.out.println(number);
		}

		System.out.println("------------------------------------");
		dao.findByHighwayType(HighwayType.STATE_HIGHWAY);

		System.out.println("------------------------------------");
		Collection<HighwayDTO> numberbystatename = dao.findNumberByStateName("Karnataka");
		for (HighwayDTO highway : numberbystatename) {
			System.out.println(highway);
		}

		System.out.println("------------------------------------");
		Collection<HighwayDTO> bystatename = dao.findByStateName("Andhra");
		for (HighwayDTO dt : bystatename) {
			System.out.println(dt);
		}

		System.out.println("------------------------------------");
		boolean contain = dao.exist(highway3);
		System.out.println("found : " + contain);

		System.out.println("------------------------------------");
		boolean condition = dao.isCondition(44);
		System.out.println("Highway condition : " + condition);

		System.out.println("------------------------------------");
		double len = dao.findLengthByNumber(111);
		System.out.println("findbylength : " + len);

		System.out.println("------------------------------------");
		HighwayDTO maxleng = dao.findByMaxLength();
		System.out.println("max length : " + maxleng);

		System.out.println("------------------------------------");
		HighwayDTO minleng = dao.findByMinLength();
		System.out.println("min length : " + minleng);

	}

}
