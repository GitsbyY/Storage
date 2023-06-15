package ezen.seven;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyMath myMath = new MyMath();
		
		//myMath.firstNum = 10;
		//myMath.secondNum = 4;
		int firstNum = 10;
		int secondNum = 3;
		
		myMath.add(firstNum, secondNum);
		myMath.sub(firstNum, secondNum);
		myMath.divide(firstNum, secondNum);
		myMath.mod(firstNum, secondNum);
		myMath.mul(firstNum, secondNum);
		
		/*
		result = myMath.divide();
		System.out.println(result);
		
		result = myMath.mul();
		System.out.println(result);
		
		result = myMath.sub();
		System.out.println(result);
		
		result = myMath.mod();
		System.out.println(result);
		*/
	}

}
