package com.abstractvehicle;

public abstract class AbstractVehicle {

	// 定义公共变量speed
	public int speed;

	/**
	 * 该方法为普通方法,启动
	 */
	public void start() {
		System.out.println("Vehicle start……");

	}

	/**
	 * 该方法为抽象方法，停止
	 */
	public abstract void stop();

	/**
	 * 该方法为抽象方法，加速
	 */
	public abstract void speedUp(int speed);

	/**
	 * 该方法为抽象方法，返回当前车速
	 */
	public abstract int getSpeed();

}
