package com.zhaoxiaoke.RunExcecit;

import java.util.Map;


public class CArrest {
	/*
	 * �ж���true
	 */
	public static void isTrue(boolean bl , String message){
		if(!bl){
		 throw new CRunExecit(message);
		}
	}
	/*
	 * �ж��ǿ�
	 */
	public static void isNull(Map<String, Object> map , String message){
		
		if(map==null || map.size()==0){
			throw new CRunExecit(message);
		}
	}
}
