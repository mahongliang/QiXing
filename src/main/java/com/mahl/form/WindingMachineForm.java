package com.mahl.form;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WindingMachineForm {

	private String machineId;

	private String employeeName;

	private String cardId;

	private String ctype;

	private String mahicneOutput;

	private String runTime;

	private String idleTime;

	private String errorTime;

	private String recordTime;

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(int machineId) {
		this.machineId = machineId + "";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getMahicneOutput() {
		return mahicneOutput;
	}

	public void setMahicneOutput(int mahicneOutput) {
		this.mahicneOutput = mahicneOutput + "";
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
