package com.bw.zhao;

import java.util.List;
import java.util.Map;

public class DuanYan {
	
	public static void isTrue(boolean exp , String message){
		if(!exp){
			throw new ZRunExcetion(message);
		}
	}
	
	public static void isMapNull(Map<String, Object> map , String message){
		if(map.size()==0 || map==null){
			throw new ZRunExcetion(message);
		}
	}
	
	public static void isListTrue(List<Object> list, String message){
		if(list.size()==0 || list==null){
			throw new ZRunExcetion(message);
		}
	}
	
	public static void isTrue(String exp , String message){
		if(exp.length()==0||exp==null||exp==""){
			throw new ZRunExcetion(message);
		}
	}
	
	public static void isMax(int exp,String message){
		if(exp<0){
			throw new ZRunExcetion(message);
		}
	}
}
