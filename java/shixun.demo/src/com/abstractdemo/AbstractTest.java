package com.abstractdemo;

public class AbstractTest {

	public static void main(String[] args) {
		// 实例化一个狗
		Animal dog = new Dog();
		// 赋值
		dog.setName("teddy");
		// 狗类重写了动物类的跑方法,因此将输出狗类中对于此方法单独的实现
		dog.run();
		// 狗类和猫类都不是抽象类,所以必须实现动物类的叫方法,因此将输出各自对于此方法的实现内容
		dog.shout();

	}

}
