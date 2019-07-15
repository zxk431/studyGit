package com.bw.test;

import org.junit.Test;

import com.bw.zhao.Dy;
import com.bw.zhao.RunTimeExcetion;

public class Test1 {
	
	@Test
	public void test02(){
		
		try {
			Dy.isFalse(true, "这个值不是false");
		} catch (RunTimeExcetion e) {
			e.printStackTrace();
		}
	}
}
