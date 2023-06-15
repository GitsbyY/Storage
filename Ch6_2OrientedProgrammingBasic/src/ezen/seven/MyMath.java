package ezen.seven;

public class MyMath {
	
	void add(int firstNum, int secondNum) {
		
		int result = 0;
		
		result = firstNum + secondNum;
		
		System.out.println(result);
		
	}
	
	void sub(int firstNum, int secondNum) {
		
		int result = 0;
		
		result = firstNum - secondNum;
		
		System.out.println(result);
		
	}
	
	void mul(int firstNum, int secondNum) {
		
		int result = 0;
		
		result = firstNum * secondNum;
		
		System.out.println(result);
		
	}
	
	void divide(int firstNum, int secondNum) {
		
		double result = 0;
		
		result = ((int)(((double)firstNum / secondNum) * 1000.0 + 1) / 1000.0);
		
		System.out.println(result);
		
	}
	
	void mod(double firstNum, double secondNum) {
		
		double result = 0;
		
		result = (double)firstNum % secondNum;
		
		System.out.println(result);
		
	}
	
	
}
