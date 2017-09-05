package com.adventurergame.test;

public class Test {

	public static void main(String[] args) {
		// 实例化story
		Story story = new Story();
		story.start();
		// 第一场
		story.fistBattle();
		story.fight();
		story.judge();
		// 第二场
		story.secondBattle();
		story.fight();
		story.judge();

	}

}
