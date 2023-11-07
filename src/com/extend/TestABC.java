package com.extend;

public class TestABC {

	public static void main(String[] args) {
		// 부모클래스의 참조변수는 자식객체를 참조할 수 있다. (다형성)
		TestA oba = new TestA();
		TestA obb = new TestB(); // 업캐스팅
		TestA obc = new TestC();  // A타입의 참조변수 obc에 자식객체를 참조
		
		oba.methodA();
		obb.methodA();  // 재정의된 자식 매서드가 호출 (동적 바인딩)
		obc.methodA(); 
		
		// 여러타입의 객체를 하나의 타입(TestA)으로 관리할 수 있고
		// 하나의 타입의 통해서 여러 객체를 관리하더라도 
		// 실행형태가 정의된 모양대로 달라질수 있다는건 엄청난 장점이다.
		
		
		TestA[] ob = new TestA[] {oba, obb ,obc};
		for(int i = 0; i< ob.length; i++) {
			ob[i].methodA();
		}
		TestB tmp = (TestB)obb;  // 다운캐스팅
		System.out.println(obb);
		System.out.println(tmp);
		tmp.methodB(); // 다운캐스팅 후 자식메소드를 사용 가능
		
		System.out.println(obb instanceof TestA);   // obb는 TestA로 만들어 졌니?
		System.out.println(obb instanceof TestC);
		
		for(int i=0; i<ob.length;i++) {
			ob[i].methodA();
			if(ob[i] instanceof TestB) {
				TestB b = (TestB)ob[i];
				b.methodB();				
			}else if (ob[i] instanceof TestC) {
				TestC c = (TestC)ob[i];
				c.methodC();				
			}
		}

	}

}

