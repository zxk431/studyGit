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
	
	//方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test01(){
		try {
			AsserUtil.isTrue(true, "这个断言为false");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test02(){
		try {
			AsserUtil.isFalse(false, "这个断言为true");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test03(){
		String obj = "";
		try {
			AsserUtil.notNull(obj, "对象为空");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test04(){
		String obj = "";
		try {
			AsserUtil.isNull(obj, "对象不为空");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test05(){
		try {
			List<Object> coll = new ArrayList<Object>();
			AsserUtil.notEmpty(coll, "结合为空");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test06(){
		try {
			Map<Object, Object> map = new HashMap<Object, Object>();
			AsserUtil.notEmpty(map, "map为空");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test07(){
		try {
			String condition = "  ";
			AsserUtil.hasText(condition, "字符串没有值");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void test08(){
		try {
			BigDecimal value = new BigDecimal("-1");
			AsserUtil.greaterThanZero(value, "值小于0");
		} catch (RunExcaption e) {
			e.printStackTrace();
		}
	}
	
	
}
