package com.Vehicle;

public class Car implements Vehicle {
	
	int speed;

	public void start() {

		System.out.println("Car start……");
	}

	public void stop() {

		System.out.println("Car stop……");
	}

	public void speedUp(int speed) {

		System.out.println("Car speed up :" + speed);
		this.speed = speed;
	}

	public int getSpeed() {

		System.out.println("Current car speed is :" + speed);
		return 0;
	}

}
