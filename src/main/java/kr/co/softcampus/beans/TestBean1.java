package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

//IOC 컨테이너 객체를 생성할때 자동으로 객체가 생성된다.
//타입을 통해 등록된 Bean객체를 가져올수 있다.
//Singleton
@Component
public class TestBean1 {

	
	public TestBean1() {
		System.out.println("TestBena1의 생성자");
	}

}
