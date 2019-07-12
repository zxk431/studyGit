package com.bw.test;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.bw.util.NumUtil;

public class NumTest {
	
	NumUtil numUtil = new NumUtil();

	@Test
	public void test1() {
		int result = numUtil.add(1,2);
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void test2() {
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//Assert.assertNotNull(arrayList);
		ArrayList<Integer> list = null;
		Assert.assertNull(list);
	}
	
	@Test
	public void test3() {
		//Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map = null;
		Assert.assertNull(map);
		//Assert.assertEquals(0, map.keySet().size());
		
	}
	
	@Test
	public void test4() {
		String str = "abc  de f   g";
		str = str.replaceAll(" ", "");
		Assert.assertEquals(7, str.length());
	}

}
