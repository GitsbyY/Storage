
public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		변수란, 단 하나의 값을 저장할 수 있는 메모리 공간
//		
//		수학에서 변수를 변하는 수라고 정의한다
//		프로그래밍 언어에서는 변수를
//		값을 저장할 수 있는 메모리 상의 공간을 의미한다
//		
//		변수의 특징
//		1하나의 변수에 단 하나의 값만 저장할 수 있다
//		2새로운 값을 저장하면 기존의 값은 사라진다
//		
//		변수의 선언과 초기화
		int year;
//		변수타입 변수명 year라는 이름의 변수를 선언
		int age = 14;
		// age 변수를 선언하고 14로 초기화 한다
		
//		변수의 초기화란, 변수를 사용하기 전에 처음으로 값을 저장하는 것
		year = 0;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
//		syso 상태에서  ctrl + 스페이스
		System.out.println(year);
		System.out.println(age);
		
	}

}
