package com.abstractvehicle;

public class Bus extends AbstractVehicle {

	@Override
	public void stop() {

		System.out.println("Bus stop……");
	}

	@Override
	public void speedUp(int speed) {

		System.out.println("Bus speed up :" + speed);
		this.speed = speed;
	}

	@Override
	public int getSpeed() {

		System.out.println("Current bus speed is :" + speed);
		return 0;
	}

}
