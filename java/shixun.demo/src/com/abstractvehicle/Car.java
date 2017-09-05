package com.abstractvehicle;

public class Car extends AbstractVehicle {

	@Override
	public void stop() {

		System.out.println("Car stop……");
	}

	@Override
	public void speedUp(int speed) {

		System.out.println("Car speed up :" + speed);
		this.speed = speed;
	}

	@Override
	public int getSpeed() {

		System.out.println("Current car speed is :" + speed);
		return 0;
	}

}
