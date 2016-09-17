package com.mahl.service;

import java.util.List;


import com.mahl.pojo.SelectMachine;
import com.mahl.pojo.WindingMachine;

public interface IUserAction {

	List<SelectMachine> getSelectMachines();
	
	List<WindingMachine> getWindingMachines();
	
}
