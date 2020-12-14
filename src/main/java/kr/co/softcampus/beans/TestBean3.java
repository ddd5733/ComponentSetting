package kr.co.softcampus.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
//getBean 매소드를 호출할때 객체가 생성된다
//Singleton
@Lazy
public class TestBean3 {

	public TestBean3() {
		super();
		System.out.println("TestBean3의 생성자");
	}
	
}
