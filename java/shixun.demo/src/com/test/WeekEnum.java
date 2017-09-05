package com.test;

public class WeekEnum {

	public enum Week{
		MON,TUE,WED,THU,FRI,SAT,SUN;
	}
	public static void main(String[] args) {
		//使用for循环进行遍历枚举
		for (Week day:Week.values()){
			System.out.println(day.toString());
		}
		System.out.println("Enum.valueOF()"+Week.valueOf("TUE"));
		
		System.out.println("Week.WED.orainal()"+Week.WED.ordinal());

	}
	
	
	
	

}
