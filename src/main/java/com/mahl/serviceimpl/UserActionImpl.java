package com.mahl.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahl.dao.BaomoMachineDao;
import com.mahl.dao.SelectMachineDao;
import com.mahl.dao.WindingMachineDao;
import com.mahl.pojo.BaomoMachine;
import com.mahl.pojo.SelectMachine;
import com.mahl.pojo.WindingMachine;
import com.mahl.service.IUserAction;

@Component("userAction")
public class UserActionImpl implements IUserAction{
	
	@Autowired
	private SelectMachineDao selectMachineDao;
	@Autowired
	private WindingMachineDao windingMachineDao;
	@Autowired	
	private BaomoMachineDao baomoMachineDao;

	@Override
	public List<SelectMachine> getSelectMachines() {
		// TODO Auto-generated method stub
		return selectMachineDao.getAll();
	}

	@Override
	public List<WindingMachine> getWindingMachines() {
		// TODO Auto-generated method stub
		return windingMachineDao.getAll();
	}
	
	public List<BaomoMachine> getBaomoMachines(){
		return baomoMachineDao.getAll();
	}
	

}
