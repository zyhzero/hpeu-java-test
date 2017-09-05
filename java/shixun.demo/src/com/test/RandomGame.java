package com.test;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		// 使用Random可以产生随机数
		Random random = new Random();
		// 随机数大于等于0小于100（不等于100）
		int result = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		// 循环判断
		while (true) {
			System.out.println("请输入猜的数字");
			int number = scanner.nextInt();
			if (number < result) {
				System.out.println("输入的值太小");
			} else if (number > result) {
				System.out.println("输入的值太大");
			} else {
				System.out.println("猜对啦！");
				break;
			}
		}
		scanner.close();
	}

}
