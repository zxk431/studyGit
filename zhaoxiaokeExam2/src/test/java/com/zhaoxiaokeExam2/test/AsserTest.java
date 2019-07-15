package com.zhaoxiaokeExam2.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import zhaoxiaokeExam2.AsserUtil;
import zhaoxiaokeExam2.RunExcaption;

public class AsserTest {
	
	//����1������Ϊ�棬���Ϊ�٣����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test01(){
		try {
			AsserUtil.isTrue(true, "�������Ϊfalse");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//����2������Ϊ�٣����Ϊ�棬���׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test02(){
		try {
			AsserUtil.isFalse(false, "�������Ϊtrue");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//����3�����Զ���Ϊ�գ����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test03(){
		String obj = "";
		try {
			AsserUtil.notNull(obj, "����Ϊ��");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//����4�����Զ������գ������Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test04(){
		String obj = "";
		try {
			AsserUtil.isNull(obj, "����Ϊ��");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//����5�����Լ��ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test05(){
		try {
			List<Object> coll = new ArrayList<Object>();
			AsserUtil.notEmpty(coll, "���Ϊ��");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//����6������Map���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test06(){
		try {
			Map<Object, Object> map = new HashMap<Object, Object>();
			AsserUtil.notEmpty(map, "mapΪ��");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//����7�������ַ���������ֵ��ȥ���ո�Ȼ���ж��ַ��������Ƿ����0�����ûֵ�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test07(){
		try {
			String condition = "  ";
			AsserUtil.hasText(condition, "�ַ���û��ֵ");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//����8������ֵ�������0�����С�ڻ����0�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	@Test
	public void test08(){
		try {
			BigDecimal value = new BigDecimal("-1");
			AsserUtil.greaterThanZero(value, "ֵС��0");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	
}
