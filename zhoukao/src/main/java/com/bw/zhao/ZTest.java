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
			DuanYan.isMax(-1, "�������������");
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
			DuanYan.isListTrue(list, "��������ǿ�");
		} catch (ZRunExcetion e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3(){
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			//map.put("����������", "�Ŀ�����");
			DuanYan.isMapNull(map, "���map�ǿ�");
		} catch (ZRunExcetion e) {
			e.printStackTrace();
		}
	}
}
