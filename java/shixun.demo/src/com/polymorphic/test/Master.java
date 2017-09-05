package com.polymorphic.test;

public class Master extends Player {
    /**
     * 攻击
     */
	@Override
    public void attack() {
        System.out.println("我是法师，丢火球");
    }
}