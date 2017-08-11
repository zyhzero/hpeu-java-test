package com.adventurergame.test;

public class Warrior extends Adventurer {

	private String name = "超级皮卡";
	private int hp = 200;
	private int attack = 30;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		System.out.println("呦呼，我是超级皮卡，血厚攻击强，我的血量为 " + hp + " ，攻击力为 " + attack + " 。");
	}

	public int attack() {
		System.out.println("超级皮卡还剩 " + hp + " 点血，他砍出一剑，造成 " + attack + " 点伤害 ");
		return attack;

	}

}
