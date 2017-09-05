package com.polymorphic.test;

public class Warrior extends Player {
    /**
     * 攻击
     */
    @Override
    public void attack() {
        System.out.println("我是战士，拿砍刀砍");
    }
}