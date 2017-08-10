package com.dogbark.test;

public class BigDog extends Dog {

	/**
	 * 重写父类bark(int times)方法
	 */
	@Override
	public void bark(int times) {
		System.out.println("大狗叫:" + times + "声！");
	}

}
