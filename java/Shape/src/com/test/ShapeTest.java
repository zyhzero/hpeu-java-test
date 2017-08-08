package com.test;

public class ShapeTest {

	public static void main(String[] args) {

		// 实例化一个对象
		Shape shape = new Shape();
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		// 打印方法
		shape.girth();
		shape.area();
		circle.girth();
		circle.area();
		rectangle.girth();
		rectangle.area();
	}

}
