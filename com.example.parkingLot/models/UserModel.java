package models;

public class UserModel {
	String userName;
	int contactNo;
	TicketModel ticket;
	
	public TicketModel getTicket() {
		return ticket;
	}
	public void setTicket(TicketModel ticket) {
		this.ticket = ticket;
	}

	/*
	 * public UserModel(String userName, int contactNo) { super(); this.userName =
	 * userName; this.contactNo = contactNo; }
	 */
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
}

