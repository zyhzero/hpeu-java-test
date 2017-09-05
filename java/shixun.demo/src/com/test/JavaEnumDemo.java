package com.test;

public class JavaEnumDemo {

	// 定义枚举UserStatus
	enum UserStatus {
		INACTIVE, NORMAL, EXPIRED;
	}
	
	//用于描述状态信息
	String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UserStatus states = UserStatus.EXPIRED;
//		System.out.println(states.getDesciption());
//		System.out.println(Enum.valueOf(UserStatus.class, "NORMAL").getDesciption());
//		for (UserStatus userStatus : UserStatus.values()) {
//			System.out.println(userStatus.getDesciption());
//		}
	}
}
