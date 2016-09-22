package com.mahl.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mahl.dto.BaomoMachineForm;
import com.mahl.dto.DataGrid;
import com.mahl.dto.PageHelper;
import com.mahl.dto.SelectMachineForm;
import com.mahl.dto.WindingMachineForm;
import com.mahl.pojo.BaomoMachine;
import com.mahl.pojo.SelectMachine;
import com.mahl.pojo.WindingMachine;
import com.mahl.service.IUserAction;
import com.mahl.serviceimpl.UserActionImpl;

@Controller
@RequestMapping("/machine")
public class MachineController {
	
	private final Logger log = LoggerFactory.getLogger(MachineController.class);

	@Autowired
	private IUserAction userAction;
	
	
	@ResponseBody
	@RequestMapping(value="/winding", method = RequestMethod.POST)
	public DataGrid<WindingMachineForm> datagrid(PageHelper page,WindingMachineForm windingMachineForm) {
		log.info("winding reflesh");
		DataGrid<WindingMachineForm> dg = new DataGrid<WindingMachineForm>();
		long total = userAction.getWindingTotalRows();
		List<WindingMachineForm> list = userAction.getWindingMachinesByPage(page);
		dg.setTotal(total);
		dg.setRows(list);
		return dg;
	}
	
	@ResponseBody
	@RequestMapping(value="/baomo", method = RequestMethod.POST)
	public DataGrid<BaomoMachineForm> datagrid(PageHelper page,BaomoMachineForm baomoMachineForm) {
		log.info("baomo reflesh");
		DataGrid<BaomoMachineForm> dg = new DataGrid<BaomoMachineForm>();
		long total = userAction.getBaomoTotalRows();
		List<BaomoMachineForm> list = userAction.getBaomoMachinesByPage(page);
		dg.setTotal(total);
		dg.setRows(list);
		return dg;
	}
	
	@ResponseBody
	@RequestMapping(value="/select", method = RequestMethod.POST)
	public DataGrid<SelectMachineForm> datagrid(PageHelper page,SelectMachineForm selectMachineForm) {
		log.info("select reflesh");
		DataGrid<SelectMachineForm> dg = new DataGrid<SelectMachineForm>();
		long total = userAction.getSelectTotalRows();
		List<SelectMachineForm> list = userAction.getSelectMachinesByPage(page);
		dg.setTotal(total);
		dg.setRows(list);
		return dg;
	}
	
}
