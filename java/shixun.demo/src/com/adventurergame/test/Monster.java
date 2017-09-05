package com.adventurergame.test;

public class Monster {

	private int hp = 120;
	private int attack = 25;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void selfIntroduction() {
		System.out.println("哇哈哈哈我就是恶龙山的首领，你喊破喉咙也不会有人来救你的。我的血量为 "+hp+" ，攻击力为 "+attack+" 。");
	}

	public int attack() {
		System.out.println("恶龙还剩 "+hp+" 点血，它吐出一团火焰，造成 "+attack+" 点伤害 ");
		return attack;

	}
}
