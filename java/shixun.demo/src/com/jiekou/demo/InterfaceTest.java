package com.jiekou.demo;

public class InterfaceTest {

	public static void main(String[] args) {
		// 实例化一个狗类
		Animal dog = new Dog();
		// 实例化一个猫类
		Animal cat = new Cat();
		// 狗类和猫类都不是抽象类,所以必须实现动物接口中所有方法,因此将输出各自对于这些方法的实现内容
		dog.run();
		cat.run();
		dog.shout();
		cat.shout();

	}

}
