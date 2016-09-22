package com.mahl.dao;

import java.util.List;

import com.mahl.dto.PageHelper;
import com.mahl.pojo.BaomoMachine;

public interface BaomoMachineDao {

	List<BaomoMachine> findByPage(PageHelper page);

	long getTotalRows();
    
}