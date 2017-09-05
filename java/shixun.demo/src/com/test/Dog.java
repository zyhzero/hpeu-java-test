package com.test;

public class Dog {

	public Dog() {
		super();
		System.out.println("无参数的调用方法");
	}

	public Dog(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println("有参数的调用方法");
	}

	String name;
	int age;
	double weight;
	
	//代码块
	{
		System.out.println("代码块");
	}
	
	//静态代码块
	static{
		System.out.println("静态代码块");
	}
	
	public void run() {
		
		System.out.println(name+"Dog Dog  run run run!!! ");
	}

	public void eat() {
		System.out.println("Dog Dog  eat eat eat!!!  ");
	}
}
