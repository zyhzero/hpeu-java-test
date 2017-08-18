package com.shixun.atm.service;

/*
 * 账户实现类
 */
public class AccountServicelmpl extends AbstractAccount {

	/**
	 * 登录【 输入错误密码会报错】
	 */
	@Override
	public int login(String inputName, String inputPassword) {

		// 在数组内进行查找比对
		for (int i = 0; i < accounts.length; i++) {
			if (inputName.equals(accounts[i].getName()) && inputPassword.equals(accounts[i].getPassword())) {
				return i;
			}
		}
		// 匹配失败
		return -1;
	}

	/**
	 * 查看余额ok
	 */
	@Override
	public double queryBalance(int accountIndex) {
		double query = accounts[accountIndex].getBalance();
		return query;
	}

	/**
	 * 存款ok
	 */
	@Override
	public double deposit(int accountIndex, double depositAmount) {
		accounts[accountIndex].setBalance(depositAmount + accounts[accountIndex].getBalance());
		return accounts[accountIndex].getBalance();
	}

	/**
	 * 取款ok
	 */
	@Override
	public double withdraw(int accountIndex, double withdrawAmount) {
		// 调用取款方法
		// TODO 警示信息展示不出来
		if (accounts[accountIndex].getBalance() >= withdrawAmount) {
			accounts[accountIndex].setBalance(accounts[accountIndex].getBalance() - withdrawAmount);
			return accounts[accountIndex].getBalance();
		} else {
			return -1;
		}
	}

	/**
	 * 转账【转账成功跳转页面】
	 */
	@Override
	public double transfer(int accountIndex, String targetAccountName, double transferAmount) {

		//如果转账给自己
		if (targetAccountName.equals(accounts[accountIndex].getName())) {
			return -3;
		}
		for (int i = 0; i < accounts.length; i++) {
			// 遍历数组有这个人且转账金额小于账户
			if (accounts[i].getName().equals(targetAccountName)
					&& (accounts[accountIndex].getBalance() >= transferAmount)) {
				// 执行转账，扣除金额
				accounts[accountIndex].setBalance(accounts[accountIndex].getBalance() - transferAmount);
				// 对方账户金额增加
				accounts[i].setBalance(accounts[i].getBalance() + transferAmount);
				return accounts[accountIndex].getBalance();
			} else if (accounts[i].getName().equals(targetAccountName)
					&& (accounts[accountIndex].getBalance() < transferAmount)) {
				// 余额不足
				return -1;
			}
		}
		// 找不到转账用户
		return -2;
	}

	/**
	 * 改密【出错】
	 */
	@Override
	public int changePassword(int accountIndex, String Password, String newPassword) {
		if (Password.equals(accounts[accountIndex].getPassword())) {
			accounts[accountIndex].setPassword(newPassword);
			return 0;
		} else {
			return -1;
		}
	}

}
