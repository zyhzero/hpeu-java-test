package com.adventurergame.test;

public class Adventurer {

	
	
	
	private String name = "冒险家";
	private int hp = 100;
	private int attack = 20;

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
		System.out.println("大家好，我是这个游戏的主角，只是现在是没有主角光环的群演，我的血量为 "+hp+" ，攻击力为 "+attack+" 。");
	}

	public int attack() {
		System.out.println("冒险家还剩 "+hp+" 点血，他打出一拳，造成 "+attack+" 点伤害 ");
		return attack;

	}

}
