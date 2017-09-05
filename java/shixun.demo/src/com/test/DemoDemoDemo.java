package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoDemoDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 建立一个数组
//		int[] integers = {1,2,3,4};
//		// 开始遍历 
//		for (int i : integers) {
//		    // 依次输出 1、2、3、4 
//			System.out.println(i);
//		}
////		List<Integer> arrayList=new ArrayList<>();
//
//		
//		
//		//数组的查找
//				String[] stringArray = { "a", "b", "c", "d", "e" };
//				// 将数组转换成 List，并查找数组中是否包含 a
//				boolean result = Arrays.asList(stringArray).contains("a");
//				// 打印查找结果
//				System.out.println("Check Result --> " + result);
//
//				boolean result1 = false;
//				for (String item : stringArray) {
//					if ("a".equals(item)) {
//						result1 = true;
//						break;
//					}
//				}
//				System.out.println("Check Result --> " + result1);
//				
//				//数组的排序
//				int[] intArray={3,8,8,6,15,35,31,59,0};
//				Arrays.sort(intArray);
//				for (int item :intArray){
//					System.out.println(item);
//				}
//				
//				//数组的排序
//				String[] strArray={"java","C++","www","school","hi"};
//				Arrays.sort(strArray,new StringCompatator());
//				for (int item :intArray){
//					System.out.println(item);
//				}
//				
//				static class StringCompatator implements Comparator<String>{
//					@Override
//					public int compare(String o1,String o2){
//						return o1.compareTo(o2); 
//					}
//				}
		int a=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				a+=i;
			}else{
				continue;
			}
		}
		System.out.println(a);

	}

}
