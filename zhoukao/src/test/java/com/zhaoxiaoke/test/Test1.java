package com.zhaoxiaoke.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zhaoxiaoke.RunExcecit.CArrest;
import com.zhaoxiaoke.RunExcecit.CRunExecit;

public class Test1 {
	
	CArrest carrest = new CArrest();
	
	@Test
	public void test1(){
		try {
			carrest.isTrue(false, "�ⲻ��true");
		} catch (CRunExecit e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	@Test
	public void test2(){
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			carrest.isNull(map, "mapΪ��");
		} catch (CRunExecit e) {
			e.printStackTrace();
		}
		
	}
}
