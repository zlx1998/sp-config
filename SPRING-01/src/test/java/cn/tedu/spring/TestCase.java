package cn.tedu.spring;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	public void getDate() {
		//����Spring�����ļ������Spring����
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��Spring�����л�ȡ����
		Date date = (Date) ac.getBean("date");
		//��������ȡ�Ķ���
		System.out.println(date);
		ac.close();
	}
}
