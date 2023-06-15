package ezen.six;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result = 0.0;
		MyMath myMath = new MyMath();
		
		myMath.firstNum = 10;
		myMath.secondNum = 4;
		
		result = myMath.add();
		System.out.println(result);
		
		result = myMath.divide();
		System.out.println(result);
		
		result = myMath.mul();
		System.out.println(result);
		
		result = myMath.sub();
		System.out.println(result);
		
		result = myMath.mod();
		System.out.println(result);
	}

}
