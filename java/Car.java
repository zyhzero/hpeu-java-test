package com.car.test;

import java.util.Scanner;

public class Car {
	private String name;
	private int speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Car naem is:" + name);
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public int setSpeed(int speed) {
		System.out.println("Car speed is:" + speed);
		if (speed > 150) {
			System.out.println("速度不允许超过：150，您目前的速度为：" + speed + "，请小心驾驶");
			return speed;
		} else if (speed < 0) {
			System.out.println("额……倒车也不会是负值速度吧");
		}
		// 更新速度
		this.speed = speed;
		System.out.println("您的速度正常，为：" + speed + "，请谨慎驾驶");
		return speed;
	}

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
