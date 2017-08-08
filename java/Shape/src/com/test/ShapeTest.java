package com.test;

import java.io.StreamCorruptedException;
import java.util.Arrays;

public class ShapeTest {

	public static void main(String[] args) {

		// 打印方法
		// 实例化一个对象
		Shape shape = new Shape();
		shape.girth();
		shape.area();

		shape = new Circle();
		shape.girth();
		shape.area();

		shape = new Rectangle();
		shape.girth();
		shape.area();

	}

}
