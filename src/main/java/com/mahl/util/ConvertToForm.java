package com.mahl.util;


import java.util.ArrayList;
import java.util.List;

import com.mahl.form.BaomoMachineForm;
import com.mahl.form.SelectMachineForm;
import com.mahl.form.WindingMachineForm;
import com.mahl.pojo.BaomoMachine;
import com.mahl.pojo.SelectMachine;
import com.mahl.pojo.WindingMachine;

public class ConvertToForm {
	
	public static SelectMachineForm convertToSelectForm(SelectMachine machine){
		SelectMachineForm form  = new SelectMachineForm();
		form.setMachineId(machine.getMachineId());
		form.setEmployeeName(machine.getEmployeeName());
		form.setFirstGrade(machine.getFirstGrade());
		form.setSecondGrade(machine.getSecondGrade());
		form.setThirdGrade(machine.getThirdGrade());
		form.setRunTime(machine.getRunTime());
		form.setIdleTime(machine.getIdleTime());
		form.setErrorTime(machine.getErrorTime());
		form.setRecordTime(machine.getRecordTime());
		
		return form;	
	}
	
	public static List<SelectMachineForm> getSelectMachineForm(List<SelectMachine> machines){
		List<SelectMachineForm> list = new ArrayList<SelectMachineForm>();
		for (SelectMachine machine : machines) {
			list.add(convertToSelectForm(machine));
		}
		return list;
	}
	
	public static WindingMachineForm convertToWindingForm(WindingMachine machine){
		WindingMachineForm form  = new WindingMachineForm();
		form.setMachineId(machine.getMachineId());
		form.setEmployeeName(machine.getEmployeeName());
		
		form.setCardId(machine.getCardId());
		form.setCtype(machine.getCtype());
		form.setMahicneOutput(machine.getMahicneOutput());
		
		form.setRunTime(machine.getRunTime());
		form.setIdleTime(machine.getIdleTime());
		form.setErrorTime(machine.getErrorTime());
		form.setRecordTime(machine.getRecordTime());
		
		return form;	
	}
	
	public static List<WindingMachineForm> getWindingMachineForm(List<WindingMachine> machines){
		List<WindingMachineForm> list = new ArrayList<WindingMachineForm>();
		for (WindingMachine machine : machines) {
			list.add(convertToWindingForm(machine));
		}
		return list;
	}
	
	
	public static BaomoMachineForm convertToWindingForm(BaomoMachine machine){
		BaomoMachineForm form  = new BaomoMachineForm();
		form.setMachineId(machine.getMachineId());
		form.setEmployeeName(machine.getEmployeeName());
		
		form.setCardid(machine.getCardId());
		
		form.setMachineOutput(machine.getMachineOutput());
		
		form.setRunTime(machine.getRunTime());
		form.setIdleTime(machine.getIdleTime());
		form.setErrorTime(machine.getErrorTime());
		form.setRecordTime(machine.getRecordTime());
		
		return form;	
	}
	
	public static List<BaomoMachineForm> getBaomoMachineForm(List<BaomoMachine> machines){
		List<BaomoMachineForm> list = new ArrayList<BaomoMachineForm>();
		for (BaomoMachine machine : machines) {
			list.add(convertToWindingForm(machine));
		}
		return list;
	}
	

}
