
public class Ch3OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		조건 연산자
//      삼항 연산자라고 부른다.
//		조건식?   식1   :   식2;
//		            참인 경우      거짓인 경우
		
		int sexCheck = 0;
		String resultStr = "";
		sexCheck = 3;
		
		resultStr = (sexCheck == 1) ? "남자" : "여자";
					// 조건식			  참인 경우    거짓인 경우
										// 중첩 삼항 연산자가 있음. 인터넷찾기.
		System.out.println(resultStr + "입니다.");
		
	}

}
