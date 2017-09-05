package com.shixun.atm.service;

/**
 * 账户接口类
 */
public interface AccountService {

	void initAccounts();

	int login(String inputName, String inputPassword);

	double queryBalance(int accountIndex);

	double deposit(int accountIndex, double depositAmount);

	double withdraw(int accountIndex, double withdrawAmount);

	double transfer(int accountIndex,String targetAccountName, double transferAmount);

	int changePassword(int accountIndex,String Password,String newPassword);

}
