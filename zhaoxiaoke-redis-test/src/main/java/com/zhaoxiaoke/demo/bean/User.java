package com.zhaoxiaoke.demo.bean;

import java.io.Serializable;
import java.util.Date;

//实例类必须实现Serializable接口
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//编写User类，共有ID，姓名，性别，手机，邮箱，生日，共6个属性。
	private int uid;
	private String uname;
	private String sex;
	private String phone;
	private String email;
	private Date birth;
	public User() {
		super();
	}
	public User(int uid, String uname, String sex, String phone, String email, Date birth) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.birth = birth;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//并且重写hashCode()和equals(Object obj)方法
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + uid;
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (uid != other.uid)
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", sex=" + sex + ", phone=" + phone + ", email=" + email
				+ ", birth=" + birth + "]";
	}
	
	
	
}
