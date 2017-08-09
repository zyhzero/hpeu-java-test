package com.guessgame.test;

import java.util.Scanner;

public class Game {
	public static Scanner scanner = new Scanner(System.in);

	static Player player = new Player();
	static Computer computer = new Computer();

	public void roles() {
		// 初始化电脑角色
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		System.out.println("请选择对方角色（1：Sunny 2.鬼怪 3.地狱使者）默认为地狱使者：");
		String roleother = scanner.next();
		String roleothervalue = null;
		if ("1".equals(roleother)) {
			roleothervalue = "Sunny";
		} else if ("2".equals(roleother)) {
			roleothervalue = "鬼怪";
		} else {
			roleothervalue = "地狱使者";
		}
		
//		int roleother = scanner.nextInt();
//		String roleothervalue = null;
//		switch (roleother) {
//		case 1:
//			roleothervalue = "Sunny";
//			break;
//		case 2:
//			roleothervalue = "鬼怪";
//			break;
//		case 3:
//			roleothervalue = "地狱使者";
//			break;
//		default:
//			roleothervalue = "Sunny";
//
//		}
		// 初始化自己角色
		System.out.println("请输入你的名字：");
		String roleme = scanner.next();
		System.out.println(roleme + " VS " + roleothervalue);
		player.setName(roleme);
		computer.setName(roleothervalue);
	}

	public void game() {

		// 进行游戏比较
		String a = player.gameone();
		String b = computer.gametwo();
		if (("剪刀".equals(a) && "剪刀".equals(b)) || ("石头".equals(a) && "石头".equals(b))
				|| ("布".equals(a) && "布".equals(b))) {
			System.out.println("结果：平局，继续努力\n");
		} else if (("剪刀".equals(a) && "布".equals(b)) || ("石头".equals(a) && "剪刀".equals(b))
				|| ("布".equals(a) && "石头".equals(b))) {
			System.out.println("结果：恭喜，你赢了\n");
			player.setScore(player.getScore() + 1);
		} else if (("剪刀".equals(a) && "石头".equals(b)) || ("石头".equals(a) && "布".equals(b))
				|| ("布".equals(a) && "剪刀".equals(b))) {
			System.out.println("结果：很遗憾，你输了\n");
			computer.setScore(computer.getScore() + 1);
		}

	}

	public void conclusion() {
		// 玩家不玩之后总结分数
		System.out.println("姓名\t得分\t");
		System.out.println(player.getName() + "\t" + player.getScore() + "\t");
		System.out.println(computer.getName() + "\t" + computer.getScore() + "\t\n");
		if (player.getScore() > computer.getScore()) {
			System.out.println("结果：恭喜恭喜！");
			System.out.println("----------------------------------------\n");
		} else if (player.getScore() < computer.getScore()) {
			System.out.println("结果：继续努力！");
			System.out.println("----------------------------------------\n");
		} else {
			System.out.println("结果：平局，继续努力");
			System.out.println("----------------------------------------\n");
		}
	}

}
