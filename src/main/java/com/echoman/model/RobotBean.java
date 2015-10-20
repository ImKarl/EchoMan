package com.echoman.model;

public class RobotBean {
	
	private String type;
	private String account;
	private String password;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "RobotBean [type=" + type + ", account=" + account + "]";
	}
}
