package one;

import java.util.ArrayList;

public class TestArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		10개의 정수값을 가질 수 있는 배열을 만든다
//		1~12의 값을 배열에 입력하고 출력하시오
	
	      int[] numArr = new int[10];
//	           새로운 배열 변수를 만든다
	      int[] numArr2 = new int[12];
	      
	      for (int i = 0; i < numArr.length; i++) {
	         numArr[i] = i + 1;
	      }
	      
	      //10개까지는 기존의 배열에서 값을 받아서 데이터를 입력받는다
	      for (int i = 0; i < numArr2.length - 2; i++) {
	         numArr2[i] = numArr[i];
	      }
	      
//	           나머지 데이터는 새로 받는다
	      for (int i = numArr.length; i < numArr2.length; i++) {
	         numArr2[i] = i + 1;
	      }
	       
//	      12개의 데이터를 모두 출력한다
	      for (int i = 0; i < numArr2.length; i++) {
	         System.out.print(numArr2[i] + ", ");
	      }
		
	}

}
