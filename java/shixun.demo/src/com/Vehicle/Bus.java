package com.Vehicle;

public class Bus implements Vehicle {

	int speed;

	public void start() {

		System.out.println("Bus start……");
	}

	public void stop() {

		System.out.println("Bus stop……");
	}

	public void speedUp(int speed) {

		System.out.println("Bus speed up :" + speed);
		this.speed = speed;
	}

	public int getSpeed() {

		System.out.println("Current Bus speed is :" + speed);
		return 0;
	}

}
