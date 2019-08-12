package com.zhaoxiaoke.demo.utils;

import java.util.Random;

public class TestStringUtils {

	//length用户要求产生字符串的长度
	public static String getRandomString(int length){
		// String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String str="0123456789";
		Random random=new Random();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<length;i++){
			int number=random.nextInt(10);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
	
	public static String getExam(int length) {
		String string = getRandomString(length);
		
		return  string+"@qq.com";
	}

	//length用户要求产生字符串的长度
		public static String getSex(){
			// String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			
			Random random=new Random();
			int number=random.nextInt(10);
			if(number%2 ==0) {
				return "女";
			}
			
			return "男";
			
		}
	
	
}
