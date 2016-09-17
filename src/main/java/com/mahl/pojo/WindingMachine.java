package com.mahl.pojo;

import java.util.Date;

public class WindingMachine {
    private Integer machineId;

    private String employeeName;

    private String cardId;

    private String ctype;

    public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype == null ? null : ctype.trim();
	}

	private Integer mahicneOutput;

    private Boolean machineState;

    private Integer runTime;

    private Integer idleTime;

    private Integer errorTime;

    private Date recordTime;

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }


    public Integer getMahicneOutput() {
        return mahicneOutput;
    }

    public void setMahicneOutput(Integer mahicneOutput) {
        this.mahicneOutput = mahicneOutput;
    }

    public Boolean getMachineState() {
        return machineState;
    }

    public void setMachineState(Boolean machineState) {
        this.machineState = machineState;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Integer getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(Integer idleTime) {
        this.idleTime = idleTime;
    }

    public Integer getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Integer errorTime) {
        this.errorTime = errorTime;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}