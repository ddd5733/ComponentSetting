package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

//IOC �����̳� ��ü�� �����Ҷ� �ڵ����� ��ü�� �����ȴ�.
//Ÿ���� ���� ��ϵ� Bean��ü�� �����ü� �ִ�.
//Singleton
@Component
public class TestBean1 {

	
	public TestBean1() {
		System.out.println("TestBena1�� ������");
	}

}
