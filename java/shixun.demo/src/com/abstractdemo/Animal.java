package com.abstractdemo;

public abstract class Animal {
	// 动物名称
	private String name;

	/**
	 * 默认构造方法
	 */
	public Animal() {
	}

	/**
	 * 带参构造方法
	 * 
	 * @param name
	 *            动物名称
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * 跑 该方法为普通方法
	 */
	public void run() {
		System.out.println("every animal can run");
	}

	/**
	 * 叫 该方法为抽象方法,该抽象类所有的非抽象子类都必须实现该方法
	 */
	public abstract void shout();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
