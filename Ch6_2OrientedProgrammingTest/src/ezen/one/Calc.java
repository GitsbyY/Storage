package ezen.one;

//Calculator
public class Calc {

	void add(int a, int b) {
		int result = 0;
		result = a+b;
		System.out.println("+ : " + result);
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
