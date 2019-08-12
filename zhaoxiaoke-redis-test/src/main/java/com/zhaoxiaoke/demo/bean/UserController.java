package com.zhaoxiaoke.demo.bean;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.zhaoxiaoke.demo.utils.SqlMain;
import com.zhaoxiaoke.demo.utils.TestStringUtils;

@Controller
public class UserController {

	@Resource
	RedisTemplate<String, Object> redisTemplate;
	
	@Resource 
	StringRedisTemplate stringRedisTemplate;
	
	//使用JDK系列化方式保存十万个user随机对象到Redis，并计算耗时（18分）
	@RequestMapping("jdkTest")
	public String jdkTest() throws UnsupportedEncodingException {
		
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		
		//开始时间
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			User user = new User();
			user.setUid(i+1);
			user.setUname(SqlMain.getChinaName());
			user.setSex(TestStringUtils.getSex());
			user.setEmail(TestStringUtils.getExam(9));
			user.setPhone("13"+TestStringUtils.getRandomString(9));
			user.setBirth(new Date());
			
			opsForList.leftPush("users", user);
		}
		
		//结束时间
		long end = System.currentTimeMillis();
		
		//(4)保存完成后，输出系列化方式、保存数量、所耗时间三项数据，并将这三项数据复制到记事本中。（4分）
		System.out.println("JDK序列方式，保存：100000条，所耗时间："+ (end-start));
		
		return "list";
	}
	
	
	//5.使用JSON系列化方式保存十万个user随机对象到Redis，并计算耗时（18分）
	@RequestMapping("jsonTest")
	public String jsonTest() throws UnsupportedEncodingException {
		
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		
		//开始时间
				long start = System.currentTimeMillis();
				
				for(int i=0;i<100000;i++) {
					User user = new User();
					user.setUid(i+1);
					user.setUname(SqlMain.getChinaName());
					user.setSex(TestStringUtils.getSex());
					user.setEmail(TestStringUtils.getExam(9));
					user.setPhone("13"+TestStringUtils.getRandomString(9));
					user.setBirth(new Date());
					
					Object json = JSON.toJSON(user);
					opsForList.leftPush("users", json);
				}
				
				//结束时间
				long end = System.currentTimeMillis();
		
		System.out.println("JSON系列化方式，保存：100000条，所耗时间："+ (end-start));
				
		return "list";
		
	}
	
	
	//6.使用Redis的Hash类型保存十万个user随机对象到Redis，并计算耗时（18分）
	@RequestMapping("hashTest")
	public String hashTest() throws UnsupportedEncodingException {
		
		HashOperations<String, Object, Object> opsForHash = redisTemplate.opsForHash();
		
		//开始时间
		long start = System.currentTimeMillis();
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		for(int i=0;i<100000;i++) {
			Map<Object, Object> m = new HashMap<>();
			m.put("uid", i+1);
			m.put("uname", SqlMain.getChinaName());
			m.put("sex", TestStringUtils.getSex());
			m.put("email", TestStringUtils.getExam(9));
			m.put("phone", "13"+TestStringUtils.getRandomString(9));
			m.put("birth", new Date());
			
			map.put(i+"", m);
	
		}
		opsForHash.putAll("users", map);	
		//结束时间
		long end = System.currentTimeMillis();
		
		System.out.println("Hash类型，保存：100000条，所耗时间："+ (end-start));
				
		
		return "list";
	}
	
	
	
}
