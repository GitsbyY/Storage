package ezen.two;

//Calculator
public class Calc {

	int add(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	int sub(int a, int b) {
		int result = 0;
		result = a - b;
		return result;
	}

	double divide(double a, double b) {
		double result = 0;
		result = (int) (a / b * 10) / 10.0;
		return result;
	}

	int mul(int a, int b) {
		int result = 0;
		result = a * b;
		return result;
	}

}
