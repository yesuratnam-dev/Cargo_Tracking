package com.dxc.Entity;

public class Order {
	
	public int getConsignmentNO() {
		return ConsignmentNO;
	}
	
	public void setConsignmentNO(int consignmentNO) {
		ConsignmentNO = consignmentNO;
	}
	public int getConTrackingNo() {
		return ConTrackingNo;
	}
	public void setConTrackingNo(int conTrackingNo) {
		ConTrackingNo = conTrackingNo;
	}
	public String getCVName() {
		return CVName;
	}
	public void setCVName(String cVName) {
		CVName = cVName;
	}
	public String getBookingDate() {
		return BookingDate;
	}
	public void setBookingDate(String bookingDate) {
		BookingDate = bookingDate;
	}
	public String getFromLoc() {
		return FromLoc;
	}
	public void setFromLoc(String fromLoc) {
		FromLoc = fromLoc;
	}
	public String getCurrentLoc() {
		return CurrentLoc;
	}
	public void setCurrentLoc(String currentLoc) {
		CurrentLoc = currentLoc;
	}
	public String getDestLoc() {
		return DestLoc;
	}
	public void setDestLoc(String destLoc) {
		DestLoc = destLoc;
	}
	
	public Order(int consignmentNO, int conTrackingNo, String cVName, String bookingDate, String fromLoc,
			String currentLoc, String destLoc) {
		super();
		ConsignmentNO = consignmentNO;
		ConTrackingNo = conTrackingNo;
		CVName = cVName;
		BookingDate = bookingDate;
		FromLoc = fromLoc;
		CurrentLoc = currentLoc;
		DestLoc = destLoc;
	}
	
	
	
	private int ConsignmentNO;
	private int ConTrackingNo;
	private String CVName;
	private String BookingDate;
	private String FromLoc;
	private String CurrentLoc;
	private String DestLoc;

	
	
	
}
