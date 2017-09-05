package com.polymorphic.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 实例化一个 Player 对象
		Player player = new Player();
		Scanner scanner = new Scanner(System.in);

		// 在循环中进行操作
		while (true) {
			// 打印操作选项
			System.out.println("************");
			System.out.println("  1.攻击");
			System.out.println("  2.转职为法师");
			System.out.println("  3.转职为战士");
			System.out.println("************");

			// 提示用户输入
			String operation = scanner.nextLine();

			// 根据选择做不同的操作
			if ("1".equals(operation)) {
				// 让 player 攻击
				player.attack();

			} else if ("2".equals(operation)) {
				// 产生一个 Master 对象赋值给 player
				player = new Master();
				System.out.println("转职成功");

			} else if ("3".equals(operation)) {
				// 产生一个 Warrior 对象赋值给 player
				player = new Warrior();
				System.out.println("转职成功");

			} else {
				System.out.println("原地休息了一会");
			}
		}

	}

}