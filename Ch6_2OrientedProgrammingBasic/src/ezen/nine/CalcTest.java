package ezen.nine;
//더하기 메서드에 배열값들의 모든 숫자를 더하는 메서드를 추가하시오

//빼기/나누기
public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc = new Calc();
		
		double[] aArr = new double[2];
		aArr[0] = 3;
		aArr[1] = 14;
		double resultNum = 0;
		int a = 10;
		int b = 20;
		
		resultNum = calc.add(a,b);
		System.out.println(resultNum);
		
		resultNum = calc.add(3L,3);
		System.out.println(resultNum);
		
		resultNum = calc.add(4,4L);
		System.out.println(resultNum);
		
		resultNum = calc.add(5L,10L);
		System.out.println(resultNum);
		
		resultNum = calc.mod(10,5);
		System.out.println(resultNum);
		
		resultNum = calc.mod(10,5);
		System.out.println(resultNum);
		
		resultNum = calc.mod(10,5);
		System.out.println(resultNum);
		
		resultNum = calc.mod(10,5);
		System.out.println(resultNum);
		
		resultNum = calc.add(aArr);
		System.out.println(resultNum);
		
	}

}
