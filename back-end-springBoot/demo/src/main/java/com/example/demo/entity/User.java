package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {
 
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private int userAge;
	private String userVillage;
	private String userCity;
	private String userState;
	private String userCountry;
	private long userPhno;
	private Long userPincode;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserVillage() {
		return userVillage;
	}
	public void setUserVillage(String userVillage) {
		this.userVillage = userVillage;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public long getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(long userPhno) {
		this.userPhno = userPhno;
	}
	public Long getUserPincode() {
		return userPincode;
	}
	public void setUserPincode(Long userPincode) {
		this.userPincode = userPincode;
	}
	
	
}
