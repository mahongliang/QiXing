package com.mahl.dao;

import java.util.List;

import com.mahl.pojo.SelectMachine;

public interface SelectMachineDao {
	
    int insert(SelectMachine record);
    
    List<SelectMachine> getAll();

}