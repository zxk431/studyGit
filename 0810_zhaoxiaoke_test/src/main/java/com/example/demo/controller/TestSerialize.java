package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import com.example.demo.bean.User;

public class TestSerialize {

	@Test
	public void testSerial() {
		
		User user = new User(1, "赵晓科", "15175087805", new Date());
		List<Object> list = new ArrayList<Object>();
		
		for (int i = 0; i < 100000; i++) {
			list.add(user);
		}
		
		JdkSerializationRedisSerializer jdk = new JdkSerializationRedisSerializer();
		GenericJackson2JsonRedisSerializer gen = new GenericJackson2JsonRedisSerializer();
		Jackson2JsonRedisSerializer json = new Jackson2JsonRedisSerializer(List.class);
		
		long jdk_start = System.currentTimeMillis();
		byte[] jdkBytes = jdk.serialize(list);
		System.out.println("JdkSerializationRedisSerializer的序列化时间："+(System.currentTimeMillis()-jdk_start)+"ms，序列化后的长度："+jdkBytes.length);
		long jdk_dstart = System.currentTimeMillis();
		Object deserialize = jdk.deserialize(jdkBytes);
		System.out.println("JdkSerializationRedisSerializer的反序列化时间："+(System.currentTimeMillis()-jdk_dstart)+"ms");
		
		
		long gen_s = System.currentTimeMillis();
		byte[] gser = gen.serialize(list);
		System.out.println("GenericJackson2JsonRedisSerializer的序列化时间："+(System.currentTimeMillis() - gen_s)+"ms，序列化后的长度："+gser.length);
		long gen_d = System.currentTimeMillis();
		Object gendes = gen.deserialize(gser);
		System.out.println("GenericJackson2JsonRedisSerializer的反序列化时间："+(System.currentTimeMillis() - gen_d)+"ms");
		
		long json_s = System.currentTimeMillis();
		byte[] jsonser = json.serialize(list);
		System.out.println("Jackson2JsonRedisSerializer的序列化时间："+(System.currentTimeMillis() - json_s)+"ms，序列化后的长度："+jsonser.length);
		long json_d = System.currentTimeMillis();
		Object jsondes = json.deserialize(jsonser);
		System.out.println("Jackson2JsonRedisSerializer的反序列化时间："+(System.currentTimeMillis() - json_d)+"ms");
		
	}
}
