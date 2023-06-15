package ezen.five;

public class MethodBasic1 {
	int num = 0;//인스턴스 변수
	static int staticNum = 10;
	
	void instanceMethod() {
		System.out.println(num);
		System.out.println(staticNum);
	}
	
	static void staticMethod() {
		//System.out.println(num);//new를 쓰지 않으면 사용불가.
		System.out.println(staticNum);
	}
	
}
