package kr.co.sincle.user.dto;

import java.util.Date;

public class UserDTO {
//	USER_ID	NUMBER(8,0)
//	LOGIN_ID	VARCHAR2(15 BYTE)
//	LOGIN_PW	VARCHAR2(15 BYTE)
//	NAME	VARCHAR2(30 BYTE)
//	PHONE	VARCHAR2(13 BYTE)
//	EMAIL	VARCHAR2(20 BYTE)
//	STATUS	NUMBER(1,0)
//	ROLE	VARCHAR2(10 BYTE)
//	REG_DT	DATE
	
	Integer userId = null,
			status = null;
			
	String loginId = null,
			loginPw = null,
			name = null,
			phone = null,
			email = null,
			role = null;
	
	Date regDt;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", status=" + status + ", loginId=" + loginId + ", loginPw=" + loginPw
				+ ", name=" + name + ", phone=" + phone + ", email=" + email + ", role=" + role + ", regDt=" + regDt
				+ "]";
	}
	
}
