package com.example.demo.utils;

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

}
