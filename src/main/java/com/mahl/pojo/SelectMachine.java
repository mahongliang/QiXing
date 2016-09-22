package com.mahl.pojo;
import java.util.Date;

public class SelectMachine {
	
    private Integer machineId;

    private String employeeName;

    private Integer firstGrade;

    private Integer secondGrade;

    private Integer thirdGrade;

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

    public Integer getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(Integer firstGrade) {
        this.firstGrade = firstGrade;
    }

    public Integer getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(Integer secondGrade) {
        this.secondGrade = secondGrade;
    }

    public Integer getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(Integer thirdGrade) {
        this.thirdGrade = thirdGrade;
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

	@Override
	public String toString() {
		return "SelectMachine [machineId=" + machineId + ", employeeName=" + employeeName + ", firstGrade=" + firstGrade
				+ ", secondGrade=" + secondGrade + ", thirdGrade=" + thirdGrade + ", machineState=" + machineState
				+ ", runTime=" + runTime + ", idleTime=" + idleTime + ", errorTime=" + errorTime + ", recordTime="
				+ recordTime + "]";
	}
    
    
}