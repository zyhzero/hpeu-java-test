package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class scannerdemo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		System.out.println("请输入卡号：");
		str = reader.readLine();
		Scanner scanner = new Scanner(System.in);
		String scc = null;
		System.out.println("请输入金额：");
		scc = scanner.nextLine();
		System.out.println("请输入定期时间（单位：月）：");
		byte[] buffer = new byte[1024];
		int i = System.in.read(buffer);
		System.out.println("-----------");
		System.out.println("您的卡号：" + str);
		System.out.println("存入金额：" + scc);
		System.out.println("定期时间：" + i);

		
		
	}

}

