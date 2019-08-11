package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.User;
import com.example.demo.bean.User2;
import com.example.demo.utils.SqlMain;
import com.example.demo.utils.TestStringUtils;

@Controller
public class UserController {
	
	
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	
	@RequestMapping("/testJdk")
	public String testJdk() throws UnsupportedEncodingException {
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100; i++) {
			User user = new User();
			user.setUid(i+1);
			user.setUname(SqlMain.getChinaName());
			user.setPhone("13"+TestStringUtils.getRandomString(9));
			user.setBirth(new Date());
			opsForList.leftPush(i+1+"", user);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
		
		return "list";
	}
	
	@RequestMapping("/testJdkList")
	public String testJdkList() throws UnsupportedEncodingException {
		
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		long start = System.currentTimeMillis();
		
		ArrayList<Object> arrayList = new ArrayList<>();
		for(int i=0;i<100;i++) {
			User user = new User();
			user.setUid(i+1);
			user.setUname(SqlMain.getChinaName());
			user.setPhone("13"+TestStringUtils.getRandomString(9));
			user.setBirth(new Date());
			System.out.println(user);
			arrayList.add(user);
			
		}
		opsForList.leftPush("users", arrayList);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		return "list";
	}
	
	@RequestMapping("testJson")
	public String testJson() throws UnsupportedEncodingException {
		
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100;i++) {
			User2 user = new User2();
			user.setUid(i+1);
			user.setUname(SqlMain.getChinaName());
			user.setPhone("13"+TestStringUtils.getRandomString(9));
			user.setBirth(new Date());
			
			Object json = JSON.toJSON(user);
			opsForList.leftPush(i+1+"", json);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		return "list";
		
	}
	
	@RequestMapping("testJsonList")
	public String testJsonList() throws UnsupportedEncodingException {
		
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		long start = System.currentTimeMillis();
		
		List<User2> list = new ArrayList<>();
		for(int i=0;i<100;i++) {
			User2 user = new User2();
			user.setUid(i+1);
			user.setUname(SqlMain.getChinaName());
			user.setPhone("13"+TestStringUtils.getRandomString(9));
			user.setBirth(new Date());
			
			list.add(user);
		}
			Object json = JSON.toJSON(list);
			opsForList.leftPush("users", json);
			long end = System.currentTimeMillis();
			
			System.out.println(end-start);
			
		return "list";
	}
	
	
	@RequestMapping("/testHash")
	public String testHash() throws UnsupportedEncodingException {
		
		HashOperations<String, Object, Object> opsForHash = redisTemplate.opsForHash();
		
		long start = System.currentTimeMillis();
		Map<String, Object> map = new HashMap<>();
		for(int i=0;i<100;i++) {
			Map<String, Object> m = new HashMap<>();
			m.put("uid", i+1);
			m.put("uname", SqlMain.getChinaName());
			m.put("phone", "13"+TestStringUtils.getRandomString(9));
			m.put("birth", new Date());
			map.put(i+"", m);
		}
		
		opsForHash.putAll("users", map);
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		return "list";
	}
	
	
	
	
}
