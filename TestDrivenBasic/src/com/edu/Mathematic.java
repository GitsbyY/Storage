package com.edu;

public class Mathematic {
	//리턴 타입이 일반적으로 단위 테스트가 된다.
	public int sum(int a, int b) {
		
		int result = 0;
		
		result = a + b;
		
		return result;
	
	}
	
	public int[] checkNumArr(int[] numArr) {
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = numArr[i] * 5;
		}
		
		int[] resultNumArr = numArr;
		
		return resultNumArr;
		
	}
	
}
