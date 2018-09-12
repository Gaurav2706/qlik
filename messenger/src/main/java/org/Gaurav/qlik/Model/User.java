package org.Gaurav.qlik.Model;


public class User {

	private long userId;
	private Message msg;
	
	public User() {
		
	}
	public User(long id, Message msg) {
		this.userId = id;
		this.msg = msg;
	}
	public long getId() {
		return userId;
	}
	public void setId(long id) {
		this.userId = id;
	}
	public Message getMsg() {
		return msg;
	}
	public void setMsg(Message msg) {
		this.msg = msg;
	}
	
	
}
