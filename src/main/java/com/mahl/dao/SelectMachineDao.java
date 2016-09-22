package com.mahl.dao;

import java.util.List;

import com.mahl.dto.PageHelper;
import com.mahl.pojo.SelectMachine;

public interface SelectMachineDao {

	List<SelectMachine> findByPage(PageHelper page);

	long getTotalRows();
	
  

}