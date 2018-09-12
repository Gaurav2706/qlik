package org.Gaurav.qlik.Model;

import java.util.Date;

public class Message {
	
	private long messageId;
	private String message;
	private Date dateCreated;
	private boolean isPalindrome;
	
	public Message() {
		
	}
	public Message(long id, String message,Date dateCreated) {
		super();
		this.messageId = id;
		this.message = message;
		this.dateCreated = dateCreated;
	}
	public Message(long id, String message,Date dateCreated,boolean isPalindrome) {
		super();
		this.messageId = id;
		this.message = message;
		this.dateCreated = dateCreated;
		this.isPalindrome=isPalindrome;
	}
	

	public boolean isPalindrome() {
		return isPalindrome;
	}
	public void setPalindrome(boolean isPalindrome) {
		this.isPalindrome = isPalindrome;
	}
	public long getId() {
		return messageId;
	}
	public void setId(long id) {
		this.messageId = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	

}
