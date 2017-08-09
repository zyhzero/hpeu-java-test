package com.guessgame.test;

import java.util.Scanner;

public class Main {

	static Player player = new Player();
	static Computer computer = new Computer();
	static Game game = new Game();

	public static Scanner scanner = new Scanner(System.in);

	// 用来计算游戏次数的N
	private static int n = 0;

	public static void main(String[] args) {

		System.out.println("----------------欢迎进入游戏世界----------------\n");
		System.out.println("              ******************");
		System.out.println("                                人机互动猜拳游戏");
		System.out.println("              ******************\n");
		game.roles();

		do {
			do {
				// 开始游戏
				game.game();
				++n;
				// 是否开下一轮
				System.out.println("是否开始下一轮（y/n）:");
				String scannernext = scanner.next();

				// 如果选择否则不执行下一轮
				if (scannernext.equals("n")) {
					break;
				}

				System.out.println("----------------------------------------");
			} while (true);

			// 总结分数
			game.conclusion();

			// 再次询问是否开下一轮
			System.out.println("是否开始下一轮（y/n）:");
			String scannernext = scanner.next();

			// 如果选择否则不执行下一轮并退出系统
			if (scannernext.equals("n")) {
				System.out.println("系统退出成功！");
				System.exit(0);
				break;
			}

			System.out.println("----------------------------------------");

		} while (true);

	}

	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		Main.n = n;
	}

}
