package com.car.test;

import java.util.Scanner;

public class Main {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// 实例化对象
		Car car = new Car();
		// 输入name和speed
		System.out.println("请输入车名：");
		String name = input.next();
		System.out.println("请输入车速：");
		int speed = input.nextInt();
		// 设置名称和速度
		car.setName(name);
		car.setSpeed(speed);

	}

}
