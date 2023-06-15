package ezen.two;

public class MyMath {
	
//    반환타입 메소드명 (매개변수, 매개변수)
//	return 문?
//	메소드에서 마지막으로수행 될 때 반환 할 값이 있다면 사용한다.
	
	void add(int a, int b) {
		int result = 0;
		result = a+b;
		System.out.println("+ : " +result);
	}
	void sub(int a, int b) {
		int result = 0;
		result = a-b;
		System.out.println("- : " +result);
	}
	void divide(double a, double b) {
		double result = 0;
		result = (int)(a/b * 100 -1) /100.0;
		System.out.println("/ : " +result);
	}
	void mul(int a, int b) {
		int result = 0;
		result = a*b;
		System.out.println("* : " +result);
	}
	
}
