package com.bw.zhao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ZTest {
	
	@Test
	public void test1(){
		try {
			DuanYan.isMax(-1, "这个数不是正数");
		} catch (ZRunExcetion e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		try {
			List<Object> list = new ArrayList<Object>();
			list.add(1);
			list.add(2);
			DuanYan.isListTrue(list, "这个集合是空");
		} catch (ZRunExcetion e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3(){
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			//map.put("网音乐音乐", "四块五的妞");
			DuanYan.isMapNull(map, "这个map是空");
		} catch (ZRunExcetion e) {
			e.printStackTrace();
		}
	}
}
