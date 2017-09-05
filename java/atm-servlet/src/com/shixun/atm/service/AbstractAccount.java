package com.shixun.atm.service;

import com.shixun.atm.model.Account;

/**
 * 账户抽象类
 */
public abstract class AbstractAccount implements AccountService {

	// 银行账户
	protected static Account[] accounts = new Account[3];

	/**
	 * 初始化账户信息，用户数组模拟数据库，存储账户信息
	 */
	public void initAccounts() {
		// 第一个账户
		Account account1 = new Account();
		account1.setName("111");
		account1.setPassword("123");
		account1.setBalance(500);
		accounts[0] = account1;

		// 第二个账户
		Account account2 = new Account();
		account2.setName("222");
		account2.setPassword("123");
		account2.setBalance(500);
		accounts[1] = account2;

		// 第三个账户
		Account account3 = new Account();
		account3.setName("333");
		account3.setPassword("123");
		account3.setBalance(500);
		accounts[2] = account3;
	}
}