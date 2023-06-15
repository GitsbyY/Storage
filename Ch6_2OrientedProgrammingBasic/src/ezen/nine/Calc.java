package ezen.nine;

public class Calc {
	
	int add(int a, int b) {
		System.out.println("int add(int a, int b)");
		return  (int)(a + b);
	}
	
	long add(int a, long b) {
		System.out.println("long add(int a, long b)");
		return  (int)(a + b);
	}
	
	long add(long a, int b) {
		System.out.println("long add(long a, int b)");
		return (int)(a + b);
	}
	
	long add(long a, long b) {
		System.out.println("long add(long a, long b)");
		return  (int)(a + b);
	}
	
	double add(double[] aArr) {
		double sum = 0;
		for (int i = 0; i < aArr.length; i++) {
			sum = sum + aArr[i];
        }
		return sum;
	}
	
	
	double mod(int a, int b) {
		System.out.println("int add(int a, int b)");
		return  a / b;
	}
	
	double mod(double a, int b) {
		System.out.println("int add(int a, int b)");
		return  a / b;
	}
	
	double mod(int a, double b) {
		System.out.println("int add(int a, int b)");
		return a / b;
	}
	
	double mod(double a, double b) {
		System.out.println("int add(int a, int b)");
		return  a / b;
	}
	
}
