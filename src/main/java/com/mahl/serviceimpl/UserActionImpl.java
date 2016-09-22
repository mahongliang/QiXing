package com.mahl.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahl.dao.BaomoMachineDao;
import com.mahl.dao.SelectMachineDao;
import com.mahl.dao.WindingMachineDao;
import com.mahl.dto.BaomoMachineForm;
import com.mahl.dto.PageHelper;
import com.mahl.dto.SelectMachineForm;
import com.mahl.dto.WindingMachineForm;
import com.mahl.pojo.BaomoMachine;
import com.mahl.pojo.SelectMachine;
import com.mahl.pojo.WindingMachine;
import com.mahl.service.IUserAction;
import com.mahl.util.ConvertToForm;

@Component("userAction")
public class UserActionImpl implements IUserAction{
	
	@Autowired
	private SelectMachineDao selectMachineDao;
	@Autowired
	private WindingMachineDao windingMachineDao;
	@Autowired	
	private BaomoMachineDao baomoMachineDao;
	
	@Override
	public List<SelectMachineForm> getSelectMachinesByPage(PageHelper page) {
	
		page.setStart((page.getPage()-1)*page.getRows());
		page.setEnd(page.getPage()*page.getRows());
		List<SelectMachineForm> list = ConvertToForm.getSelectMachineForm(selectMachineDao.findByPage(page));
		return list;
	}
	@Override
	public List<WindingMachineForm> getWindingMachinesByPage(PageHelper page) {
		
		page.setStart((page.getPage()-1)*page.getRows());
		page.setEnd(page.getPage()*page.getRows());
		List<WindingMachineForm> list = ConvertToForm.getWindingMachineForm(windingMachineDao.findByPage(page));
		return list;
	}
	@Override
	public List<BaomoMachineForm> getBaomoMachinesByPage(PageHelper page) {
		page.setStart((page.getPage()-1)*page.getRows());
		page.setEnd(page.getPage()*page.getRows());
		List<BaomoMachineForm> list = ConvertToForm.getBaomoMachineForm(baomoMachineDao.findByPage(page));
		return list;
	}
	@Override
	public long getSelectTotalRows() {
		// TODO Auto-generated method stub
		return selectMachineDao.getTotalRows();
	}
	@Override
	public long getWindingTotalRows() {
		// TODO Auto-generated method stub
		return windingMachineDao.getTotalRows();
	}
	@Override
	public long getBaomoTotalRows() {
		// TODO Auto-generated method stub
		return baomoMachineDao.getTotalRows();
	}


	
	

}
