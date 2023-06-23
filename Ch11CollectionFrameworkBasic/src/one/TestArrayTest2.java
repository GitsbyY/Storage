package one;

import java.util.ArrayList;

public class TestArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		10개의 정수값을 가질 수 있는 배열을 만든다
//		1~12의 값을 배열에 입력하고 출력하시오
			
		
		int[] arrNum = new int[10];
	      for (int i = 0; i < arrNum.length; i++) {
	          arrNum[i] = i + 1;
	       }
	       
	       int[] arrNum2 = new int[12];
	       
	       for (int i = 0; i < arrNum2.length; i++) {
	          if (i < arrNum.length) {
	             arrNum2[i] = arrNum[i];
	          }else if (i >= arrNum.length) {
	             arrNum2[i] = i + 1;
	          }
	       }
	       
	       for (int i = 0; i < arrNum2.length; i++) {
	          System.out.print(arrNum2[i] + " ");
	       }
		
	}

}
