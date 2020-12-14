package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;


//IOC 컨테이너 가 만들어질 때 자동으로 객체가 생성된다.
//객체의 주소값을 가져올때 이름을 통해서 가져올수 있다
//Singleton
@Component("t3")
public class TestBean2 {

	public TestBean2() {
		super();
		System.out.println("TestBean2의 생성자");
	}
	
}
