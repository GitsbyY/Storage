package ezen.eight;

//매개변수?
/*
기본형 매개변수와 참조형 매개변수

기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.(read&write)

기본형은 값이 복사
참조형은 인스턴스의 주소가 복사

call by value   vs   call by reference


*/
public class PrimitiveParamEx {
	
	
	
	void change(int num) {
		num = 1000;
		
		System.out.println("change() : num = " + num);
	}
	
}
