package com.adventurergame.test;

public class Magician extends Adventurer {

	private String name = "暗夜女巫";
	private int hp = 120;
	private int attack = 50;

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
		System.out.println("哼，我是暗夜女巫，法术超强哦，我的血量为 " + hp + " ，攻击力为 " + attack + " 。");
	}

	public int attack() {
		System.out.println("暗夜女巫还剩 " + hp + " 点血，她挥挥法杖，造成 " + attack + " 点伤害 ");
		return attack;

	}
}
