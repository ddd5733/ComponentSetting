package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;


//IOC �����̳� �� ������� �� �ڵ����� ��ü�� �����ȴ�.
//��ü�� �ּҰ��� �����ö� �̸��� ���ؼ� �����ü� �ִ�
//Singleton
@Component("t3")
public class TestBean2 {

	public TestBean2() {
		super();
		System.out.println("TestBean2�� ������");
	}
	
}
