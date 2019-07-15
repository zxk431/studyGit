package com.bw.zhao;

public class Dy {
	
	public static void isFalse(boolean exp , String message){
		if(exp){
			throw new RunTimeExcetion(message);
		}
	}
}
