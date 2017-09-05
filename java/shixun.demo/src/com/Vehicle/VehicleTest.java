package com.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Car car = new Car();
		Bus bus = new Bus();

		// 调用方法
		car.start();
		car.stop();
		car.speedUp(140);
		car.getSpeed();
		bus.start();
		bus.stop();
		bus.speedUp(100);
		bus.getSpeed();
	}
	
}
