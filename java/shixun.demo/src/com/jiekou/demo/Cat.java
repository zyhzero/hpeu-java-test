package com.jiekou.demo;

public class Cat implements Animal {

	@Override
	public void run() {
		System.out.println("cat jump jump jump!!!");
	}

	@Override
	public void shout() {
		System.out.println("cat miao miao miao!!!");

	}

}
