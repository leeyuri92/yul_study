package com.extend;

public class TestB extends TestA{
	// override 재정의 - 더 좁게 정의할 수 없다.
	@Override
	void methodA() {
		System.out.println("B methodA()");
	}
	void methodB() {
		System.out.println("methodB()");
	}

}
