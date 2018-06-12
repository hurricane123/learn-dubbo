package com.hurricane.learn.dubbo.service.entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String pwd;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	
}
