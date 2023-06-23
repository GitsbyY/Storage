package one;

import java.util.ArrayList;

public class TestArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		10개의 정수값을 가질 수 있는 배열을 만든다
//		1~12의 값을 배열에 입력하고 출력하시오
		
		int[] arrTest = new int[10];
		int[] arrTest1 = new int[2];
		
		for (int i = 0; i < arrTest.length; i++) {
			arrTest[i] = i+1;
			System.out.println(arrTest[i] +"번째");
		}
		
//		for (int i = 0; i < arrTest1.length; i++) {
//			arrTest1[i] = arrTest.length + i + 1 ;
//			System.out.println(arrTest1[i] +"번째");
//		}
		
		
		
		for (int i = 0; i < arrTest1.length; i++) {
			arrTest1[i] = arrTest[9] + i + 1 ;
			System.out.println(arrTest1[i] +"번째");
		}
		
		
		
		
//		for (int i = 0; i < arrTest.length; i++) {
//			System.out.println(arrTest[i] + ", ");
//		}
		
		
		
		
	}

}
