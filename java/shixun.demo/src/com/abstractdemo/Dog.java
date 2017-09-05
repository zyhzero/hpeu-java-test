package com.abstractdemo;

public class Dog extends Animal{
	/**
     * 叫
     * 作为抽象动物类的非抽象子类,必须重写该方法
     */
    @Override
    public void shout() {
        System.out.println(super.getName() + " wang wang wang !!!");
    }
/**
     * 跑
     * 对于该普通方法,并不强制性要求重写
     */
    @Override
    public void run() {
        System.out.println(super.getName() + " jump jump jump !!!");
    }

}
