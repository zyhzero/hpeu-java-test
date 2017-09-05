package com.test;

import java.nio.charset.StandardCharsets;

public class SeasonEnum {

	// 定义枚举Season
	enum Season {
		SPRING, SUMMER, AUTUMN, WINTER;
	}

	/**
	 * 运行示例的入口main方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义当前季节为春天并打印。
		Season season = Season.SPRING;
		System.out.println("Now id:" + season);
		// 使用switch打印下一个季节
		nextSeason(season);
	}

	/**
	 * 使用Switch打印下一个季节
	 * 
	 * @param season
	 */
	public static void nextSeason(Season season) {
		switch (season) {
		case SPRING:
			season = Season.SUMMER;
			break;
		case SUMMER:
			season = Season.AUTUMN;
			break;
		case AUTUMN:
			season = Season.WINTER;
			break;
		case WINTER:
			season = Season.SPRING;
			break;

		default:
			break;
		}
		// 打印季节
		System.out.println("Next Season is:" + season);
	}
}
