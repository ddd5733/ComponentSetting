package kr.co.softcampus.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//getBean 매소드를 호출할때마다 새로운 객체를 반환한다
@Scope("prototype")
public class TestBean4 {

	public TestBean4() {
		super();
		System.out.println("TestBena4의 생성자");
	}
	
}
