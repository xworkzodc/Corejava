package com.sachin.datastore.dao;

import java.util.Collection;

import com.sachin.datastore.constant.HighwayType;
import com.sachin.datastore.dto.HighwayDTO;

public interface HighwayDAO {

	boolean save(HighwayDTO dto);

	Collection<HighwayDTO> findAll();

	Collection<Integer> findAllNumber();

	int totalItems();

	Collection<HighwayDTO> findByHighwayType(HighwayType type);

	Collection<HighwayDTO> findByStateName(String sname);

	Collection<HighwayDTO> findNumberByStateName(String sname);

	boolean exist(HighwayDTO dto);

	boolean isCondition(int number);

	double findLengthByNumber(int no);

	HighwayDTO findByMaxLength();

	HighwayDTO findByMinLength();
}
