package com.jiekou.demo;

public class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("dog run run run!!!");
	}

	@Override
	public void shout() {
		System.out.println("dog wang wang wang!!!");

	}
}
