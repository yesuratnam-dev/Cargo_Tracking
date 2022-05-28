package com.dxc.Entity;

public class Vender {
	
	public String getCvname() {
		return Cvname;
	}
	public void setCvname(String cvname) {
		Cvname = cvname;
	}
	
	public int getCvenderId() {
		return CvenderId;
	}
	public void setCvenderId(int cvenderId) {
		CvenderId = cvenderId;
	}
	public String getCvbranch() {
		return Cvbranch;
	}
	public void setCvbranch(String cvbranch) {
		Cvbranch = cvbranch;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getCvbranchLoc() {
		return CvbranchLoc;
	}
	public void setCvbranchLoc(String cvbranchLoc) {
		CvbranchLoc = cvbranchLoc;
	}
	
	
	public Vender(String cvname, int cvenderId, String cvbranch, String branchId, String cvbranchLoc) {
		super();
		Cvname = cvname;
		CvenderId = cvenderId;
		Cvbranch = cvbranch;
		this.branchId = branchId;
		CvbranchLoc = cvbranchLoc;
	}

	@Override
	public String toString() {
		return "Vender [Cvname=" + Cvname + ", CvenderId=" + CvenderId + ", Cvbranch=" + Cvbranch + ", branchId="
				+ branchId + ", CvbranchLoc=" + CvbranchLoc + "]";
	}
	

	private String Cvname;
	private int CvenderId;
	private String Cvbranch;
	private String branchId;
	private String CvbranchLoc;
	
	

}
