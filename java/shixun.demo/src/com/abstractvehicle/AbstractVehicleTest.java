package com.abstractvehicle;

public class AbstractVehicleTest {

	public static void main(String[] args) {

		// 实例化这两个对象
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
