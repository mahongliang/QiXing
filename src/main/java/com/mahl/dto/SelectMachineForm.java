package com.mahl.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectMachineForm {
	private String machineId;

    private String employeeName;

    private String firstGrade;

    private String secondGrade;

    private String thirdGrade;
    
    private String runTime;

    private String idleTime;

    private String errorTime;

    private String recordTime;

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(int machineId) {
		this.machineId = machineId+"";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(int firstGrade) {
		this.firstGrade = firstGrade+"";
	}

	public String getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(int secondGrade) {
		this.secondGrade = secondGrade+"";
	}

	public String getThirdGrade() {
		return thirdGrade;
	}

	public void setThirdGrade(int thirdGrade) {
		this.thirdGrade = thirdGrade+"";
	}

	public String getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {

		int hour = runTime / 60;
		int min = runTime % 60;
		if (hour > 24) {
			int day = hour/24;
			hour = hour-day*24;
			this.runTime = day + "天" + hour + "小时 " + min + "分";

		} else {
			this.runTime = hour + "小时 " + min + "分";
		}

	}

	public String getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(int idleTime) {
		int hour = idleTime / 60;
		int min = idleTime % 60;
		if (hour > 24) {
			int day = hour/24;
			hour = hour-day*24;
			this.idleTime = day + "天" + hour + "小时 " + min + "分";

		} else {
			this.idleTime = hour + "小时 " + min + "分";
		}
	}

	public String getErrorTime() {
		return errorTime;
	}

	public void setErrorTime(int errorTime) {
		int hour = errorTime / 60;
		int min = errorTime % 60;
		if (hour > 24) {
			int day = hour/24;
			hour = hour-day*24;
			this.errorTime = day + "天" + hour + "小时 " + min + "分";

		} else {
			this.errorTime = hour + "小时 " + min + "分";
		}
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.recordTime = sdf.format(recordTime);
	}
    
    
}