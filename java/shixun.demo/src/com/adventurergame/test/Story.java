package com.adventurergame.test;

import java.util.Random;

public class Story {

	Adventurer adventurer = new Adventurer();
	Monster monster = new Monster();

	public void start() {

		System.out.println("恶龙抓走了冒险岛的公主");
		System.out.println("英勇的冒险家踏上了拯救公主的不归路");
		System.out.println("-------------------------------------------------------------------------");

	}

	public void fistBattle() {

		System.out.println("在龙之谷新手村，一场激烈的战斗即将开始");
		// NPC自述
		adventurer.selfIntroduction();
		monster.selfIntroduction();
		System.out.println("^^^^^^^^^开始战斗^^^^^^^^^");

	}

	public void fight() {

		while (adventurer.getHp() > 0 && monster.getHp() > 0) {
			// 玩家先手攻击
			adventurer.attack();
			// 恶龙血量减少
			monster.setHp(monster.getHp() - adventurer.getAttack());
			// 判断恶龙是否存活
			if (monster.getHp() > 0) {
				// 恶龙攻击
				monster.attack();
				// 玩家血量减少
				adventurer.setHp(adventurer.getHp() - monster.getAttack());
			}
		}
	}

	public void judge() {
		if (adventurer.getHp() <= 0) {
			System.out.println(adventurer.getName() + "血槽空了！HELP！");
			// 创建随机数选取转型对象
			Random random = new Random();
			int transfer = random.nextInt(2);
			switch (transfer) {
			case 0:
				adventurer = new Warrior();
				break;
			case 1:
				adventurer = new Magician();
				break;

			default:
				break;
			}
		} else {
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println(adventurer.getName() + "打败恶龙，公主喊破喉咙得救了！");
			// 退出系统
			System.exit(0);
		}

	}

	public void secondBattle() {

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("在恶龙老巢，一场激烈的战斗即将开始");
		// 初始化恶龙的血量
		monster = new Monster();
		// NPC自述
		adventurer.selfIntroduction();
		monster.selfIntroduction();
		System.out.println("^^^^^^^^^开始战斗^^^^^^^^^");

	}
}
