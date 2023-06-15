
public class Ch3OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//가독성! => 읽기 좋다. 한 눈에 보이기 좋게 만든다. 스크롤바가 생기지 않게 만든다.
		
//		사칙 연산자
		
		int num = 10;
		int num2 = 4;
		double resultNum = 0.0;
		// double num2 = 4; 이렇게 만들면 모든 수가 실수화 된다.
		
		System.out.println(num + " + " + num2 + " = " + (num + num2));
		System.out.println(num + " - " + num2 + " = " + (num - num2));
		System.out.println(num + " * " + num2 + " = " + (num * num2));
		System.out.println(num + " / " + num2 + " = " + (num / num2));
		System.out.println(num + " / " + num2 + " = " + ((double)num / num2));
	//=>보다 좋은 코드	
		System.out.print(num + " + " + num2 + " = ");
		System.out.println(num + num2);
	//=>보다 좋은 코드	
		resultNum = num + num2;
		System.out.print(num + " + " + num2 + " = " + resultNum);
		
		
	}

}
