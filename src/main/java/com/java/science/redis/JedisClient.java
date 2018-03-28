package com.java.science.redis;

import redis.clients.jedis.Jedis;

/**
 * @Author: aiying014
 * Created by zcc on 17:22 2017/11/23.
 * @Description:
 */
public class JedisClient {
	private static Jedis jedis;
	public static synchronized Jedis InStance(){
		if (jedis==null){
			jedis = new Jedis();
		}
		return jedis;
	}
}
