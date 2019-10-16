package cn.tedu.spring;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	public void getDate() {
		//加载Spring配置文件，获得Spring容器
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从Spring容器中获取对象
		Date date = (Date) ac.getBean("date");
		//测试所获取的对象
		System.out.println(date);
		ac.close();
	}
}
