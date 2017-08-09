package com.guessgame.test;

import java.util.Random;

public class Computer {

	// 定义玩家的属性
	int s2 = 0;
	private String name;
	private int Score = s2;

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

	public String gametwo() {
		// 生成随机数0，1，2
		// 电脑随机出拳
		Random random = new Random();
		String[] arr = { "剪刀", "石头", "布" };
		int value2 = random.nextInt(arr.length);
		System.out.println(name + "出拳：" + arr[value2]);
		return arr[value2];
		// // 电脑随机出拳
		// String valuetwo = null;
		// switch (value2) {
		// case 0:
		// valuetwo = "剪刀";
		// break;
		// case 1:
		// valuetwo = "石头";
		// break;
		// case 2:
		// valuetwo = "布";
		// break;
		// }
		// System.out.println(name + "出拳：" + valuetwo);
		// return value2;

	}
}
