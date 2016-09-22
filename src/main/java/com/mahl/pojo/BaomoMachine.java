package com.mahl.pojo;
import java.util.Date;

public class BaomoMachine {
    private Integer machineId;

    private String employeeName;

    private String cardId;

    private Integer machineOutput;

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

    public Integer getMachineOutput() {
        return machineOutput;
    }

    public void setMachineOutput(Integer machineOutput) {
        this.machineOutput = machineOutput;
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
		return "BaomoMachine [machineId=" + machineId + ", employeeName=" + employeeName + ", cardId=" + cardId
				+ ", machineOutput=" + machineOutput + ", machineState=" + machineState + ", runTime=" + runTime
				+ ", idleTime=" + idleTime + ", errorTime=" + errorTime + ", recordTime=" + recordTime + "]";
	}
    
    
}