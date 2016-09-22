package com.mahl.dao;


import java.util.List;

import com.mahl.dto.PageHelper;
import com.mahl.pojo.WindingMachine;


public interface WindingMachineDao {

	List<WindingMachine> findByPage(PageHelper page);

	long getTotalRows();
    

}