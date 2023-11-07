package com.extend;
class A{
	int a;
	A(){
		System.out.println("A()");
	}
	A(int a){
		System.out.println("A(int a)");
	}
	void methodA() {System.out.println("methodA()");}
}
class B extends A{
	int b;
	B(){
		super(10);
		System.out.println("B()");
	}
	void methodB() {System.out.println("methodB()");}
}
class C extends B{
	int c;
	C(){
		super();
		System.out.println("C()");
	}
	void methodC() {System.out.println("methodC()");}
}
public class Test1 {
	public static void main(String[] args) {
		C ob = new C();
		ob.a = 10;
		ob.b = 20;
		ob.c = 30;
		ob.methodA();
		ob.methodB();
		ob.methodC();

	}

}
