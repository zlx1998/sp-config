package zt;

import java.util.List;

import redis.clients.jedis.Jedis;

public class Redis {
	public static void main(String[] args) {
		// ���ӱ��ص�Redis����
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server successfully");
		//�鿴�����Ƿ�����
//		System.out.println("Server is running:"+jedis.ping());
		// ����Redis �ַ�������
		jedis.set("w3ckey","Redis to");
		// ��ȡ�洢�����ݲ����
//		System.out.println(jedis.get("w3ckey"));
		//�洢���ݵ��б���
	    jedis.lpush("tutorial-list", "Redis");
	    jedis.lpush("tutorial-list", "Mongodb");
	    jedis.lpush("tutorial-list", "Mysql");
	    // ��ȡ�洢�����ݲ����
	    List <String> list = jedis.lrange("tutorial-list", 0, 5);
	    for (String string : list) {
			System.out.println(string);
		}
	    System.out.println("git ");
	}

}