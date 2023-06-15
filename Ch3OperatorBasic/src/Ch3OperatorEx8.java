
public class Ch3OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		대입 연산자
//		= -->대입 연산자
//		변수와 같은 저장공간에 값 또는 수식의 연산 결과를 저장하는데 사용된다.
		
		int sum = 0;
		
		sum = sum + 1;
		System.out.println(sum);
		//본래의 수식
		sum += 1; //--> sum = sum + 1
		System.out.println(sum);
		
		// +=이 처리 속도가 빠르다. 그렇기에 남용해서는 안 된다. 특별한 일이 없으면 축약은 사용 자제해야한다.
		
		sum -= 10;
		System.out.println(sum);
		
		sum /= 2;
		System.out.println(sum);
		
		sum *= 4;
		System.out.println(sum);
		
		
		
	}

}
