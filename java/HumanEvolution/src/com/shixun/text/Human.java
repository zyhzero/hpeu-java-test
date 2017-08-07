package com.shixun.text;

public class Human extends Monkey {

	/**
	 * 构造方法，执行构造方法时会先执行父类的构造方法
	 */
	public void spaek(){
		super.speak();
		System.out.println("不错嘛会说话了~");
	}
	/**
	 * 重写父类方法
	 */
	void think(){
		System.out.println("别说话，认真思考");
	}
	
}
