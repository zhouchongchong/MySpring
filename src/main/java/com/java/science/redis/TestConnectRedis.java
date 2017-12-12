package com.java.science.redis;

import redis.clients.jedis.Jedis;

/**
 * @Author: aiying014
 * Created by zcc on 19:41 2017/11/22.
 * @Description:
 */
public class TestConnectRedis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.36.130",6379);
		jedis.auth("meRedis");
		System.out.println("connect is OK===========>"+jedis.ping());
	}
}
