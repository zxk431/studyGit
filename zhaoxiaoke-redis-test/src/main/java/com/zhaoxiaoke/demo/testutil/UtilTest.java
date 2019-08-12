package com.zhaoxiaoke.demo.testutil;

import org.junit.Test;

import com.zhaoxiaoke.demo.utils.TestStringUtils;

public class UtilTest {
	
	@Test
	public void getSexdf() {
		String sex = TestStringUtils.getSex();
		System.out.println(sex);
	}
	
	@Test
	public void getEmaildd() {
		String exam = TestStringUtils.getExam(9);
		System.out.println(exam);
	}
}
