package com.ait_framework;

public abstract class BankAcc {
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	abstract public void withdraw(float accBal);
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" +accNo + ",accNm=" +",accBal" +accBal +",getAccNo()=" +getAccNo()+",getAccNm()"+getAccNm()+",getAccBal()"+getAccBal()+"]";
	}
}
