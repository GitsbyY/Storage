package ezen.eight;
/*
기본형 매개변수와 참조형 매개변수

기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.(read&write)

기본형은 값이 복사
참조형은 인스턴스의 주소가 복사

call by value   vs   call by reference


*/

public class ReferenceParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReferenceParamEx rp = new ReferenceParamEx();
		Data data = new Data();
		int num = 10;
		data.num = num;
		System.out.println("change() 전 data.num : " + data.num);
		rp.change(data);
		System.out.println("change() 후 data.num : " + data.num);
		
	}

}
