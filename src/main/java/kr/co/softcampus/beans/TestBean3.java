package kr.co.softcampus.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
//getBean �żҵ带 ȣ���Ҷ� ��ü�� �����ȴ�
//Singleton
@Lazy
public class TestBean3 {

	public TestBean3() {
		super();
		System.out.println("TestBean3�� ������");
	}
	
}
