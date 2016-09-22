package com.mahl.service;

import java.util.List;

import com.mahl.dto.BaomoMachineForm;
import com.mahl.dto.PageHelper;
import com.mahl.dto.SelectMachineForm;
import com.mahl.dto.WindingMachineForm;

public interface IUserAction {

	List<SelectMachineForm> getSelectMachinesByPage(PageHelper page);
	
	List<WindingMachineForm> getWindingMachinesByPage(PageHelper page);
	
	List<BaomoMachineForm> getBaomoMachinesByPage(PageHelper page);

	long getSelectTotalRows();
	
	long getWindingTotalRows();
	
	long getBaomoTotalRows();

	
}
