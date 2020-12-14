package kr.co.softcampus.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {

	
	public TestBean5() {
		System.out.println("TestBean5�� ������");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init �żҵ尡 ȣ��Ǿ����ϴ�.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy �żҵ尡 ȣ�� �Ǿ����ϴ�");
	}
}
