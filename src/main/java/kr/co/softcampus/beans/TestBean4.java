package kr.co.softcampus.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//getBean �żҵ带 ȣ���Ҷ����� ���ο� ��ü�� ��ȯ�Ѵ�
@Scope("prototype")
public class TestBean4 {

	public TestBean4() {
		super();
		System.out.println("TestBena4�� ������");
	}
	
}
