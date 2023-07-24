package com.app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="subscriber_registration")
//@AllArgsConstructor
//@NoArgsConstructor
public class SubscriberRegistration {
//	@Setter
//	@Getter

	@Id
	@GeneratedValue
	private int seqNo;
	private String userName;
	private String pan;
	private String mobile_number;
	private String email_id;
	private String password;
	private String activeStatus;
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public SubscriberRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "SubscriberRegistration [seqNo=" + seqNo + ", userName=" + userName + ", pan=" + pan + ", mobile_number="
				+ mobile_number + ", email_id=" + email_id + ", password=" + password + ", activeStatus=" + activeStatus
				+ "]";
	}

}
