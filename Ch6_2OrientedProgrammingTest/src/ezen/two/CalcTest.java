package ezen.two;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc myCalc = new Calc();
		
		int resultNum = 0;
		int resultNum1 = 0;
		int resultNum2 = 0;
		double resultNum3 = 0;
		
		resultNum = myCalc.add(10, 3);
		resultNum1 = myCalc.sub(10, 3);
		resultNum2 = myCalc.mul(10, 3);
		resultNum3 = myCalc.divide(88, 3);
		
		System.out.println(resultNum);
		System.out.println(resultNum1);
		System.out.println(resultNum2);
		System.out.println(resultNum3);
		
		
	}

}
