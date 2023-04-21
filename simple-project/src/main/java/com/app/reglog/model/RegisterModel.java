package com.app.reglog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="SignupDtls")
public class RegisterModel{
	private String fname;
	private String lname;
	@Id
	private String email;
	private long phnum;
	private String pwd;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhnum() {
		return phnum;
	}

	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public RegisterModel(String fname, String lname, String email, long phnum, String pwd) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phnum = phnum;
		this.pwd = pwd;
	}

	public RegisterModel() {
		super();
	}

	@Override
	public String toString() {
		return "RegisterModel [fname=" + fname + ", lname=" + lname + ", email=" + email + ", phnum=" + phnum + ", pwd="
				+ pwd + "]";
	}

}
