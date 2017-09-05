package com.test;

public class IdCard {

	private long idNumber;
	private double balance;// 余额
	private String description;

	public long getIdNumber() {

		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public double getBalance() {
		if (balance <= 0) {
			System.out.println("不合法");
			return balance;
		}
		System.out.println(balance);
		return balance;
	}

	public double setBalance(double balance) {
		if (balance <= 0) {
			System.out.println("不合法");
			return balance;
		}
		this.balance = balance;
		System.out.println(balance);
		return balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void query() {
		System.out.println("查询");

	}

	public double deposit(double a) {
		if (a <= 0) {
			System.out.println("不合法");
			return balance;
		}
		a += balance;
		System.out.println("存款之后余额为"+a);
		return a;
	}

	public void withdraw() {
		System.out.println("取款");
	}

	public void changeDescription() {
		System.out.println("更换描述");
	}
}