package zt;

import java.util.List;

import redis.clients.jedis.Jedis;

public class Redis {
	public static void main(String[] args) {
		// 连接本地的Redis服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server successfully");
		//查看服务是否运行
//		System.out.println("Server is running:"+jedis.ping());
		// 设置Redis 字符串数据
		jedis.set("w3ckey","Redis to");
		// 获取存储的数据并输出
//		System.out.println(jedis.get("w3ckey"));
		//存储数据到列表中
	    jedis.lpush("tutorial-list", "Redis");
	    jedis.lpush("tutorial-list", "Mongodb");
	    jedis.lpush("tutorial-list", "Mysql");
	    // 获取存储的数据并输出
	    List <String> list = jedis.lrange("tutorial-list", 0, 5);
	    for (String string : list) {
			System.out.println(string);
		}
	    System.out.println("git ");
	}

}