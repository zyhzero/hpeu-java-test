package com.guessgame.test;

import java.util.Scanner;

public class Player {

	public static Scanner scanner = new Scanner(System.in);

	// 定义玩家的属性
//	int s1 = 0;
	private String name;
	private int Score =0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String gameone() {
		//玩家出拳
		System.out.println("请出拳：1.剪刀 2.石头 3.布（输入相应数字,默认为布）：");
		String value1 = scanner.next();
		String valueone = null;
		if ("1".equals(value1)) {
			valueone = "剪刀";
		} else if ("2".equals(value1)) {
			valueone = "石头";
		} else {
			valueone = "布";
		}
		System.out.println("你出拳：" + valueone);
		return valueone;

		// switch (value1) {
		// case 1:
		// valueone = "剪刀";
		// break;
		// case 2:
		// valueone = "石头";
		// break;
		// case 3:
		// valueone = "布";
		// break;
		// default:
		// valueone = "剪刀";
		//
		// }
		// 后期加判断是否输入成功

	}

}
