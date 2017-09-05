package com.test;

import java.util.Scanner;

public class Main {

	public static Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("lily",1,10.0);
		dog.run();

		
		IdCard idCard=new IdCard();
		idCard.getBalance();
		idCard.setBalance(500.2);
		System.out.println("请输入存款值");
		int add =input.nextInt();
		idCard.deposit(add);
		
		
		
	}

}

