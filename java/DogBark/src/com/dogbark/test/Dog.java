package com.dogbark.test;

public class Dog {

	public void bark() {
		System.out.println("狗叫");
	}

	/**
	 * 重载 bark 方法
	 */
	public void bark(int times) {
		System.out.println("狗叫:" + times + "声！");
	}
}
