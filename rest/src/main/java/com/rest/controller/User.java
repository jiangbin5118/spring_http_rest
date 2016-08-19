package com.rest.controller;

import java.io.Serializable;


public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1874998045873088463L;

	private String userName;

	private String passWord;

	private String dataCenter;

	private String dataCenterName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDataCenter() {
		return dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
	}

	public String getDataCenterName() {
		return dataCenterName;
	}

	public void setDataCenterName(String dataCenterName) {
		this.dataCenterName = dataCenterName;
	}

}
