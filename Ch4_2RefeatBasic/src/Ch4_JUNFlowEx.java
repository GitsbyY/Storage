
public class Ch4_JUNFlowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 반복문
		 * 
		 * 어떤 작업이 반복적으로 수행되도록 할 때 사용된다
		 * 
		 * for문 표현식 for(초기화; 조건식; 증감식) { //조건식이 참일 때 수행 될 문장들을 적는다. }
		 * 
		 * 초기화 : 반복문에 사용될 변수를 초기화하는 부분이며 처음에 한 번만 수행 된다.
		 * 
		 * 조건식 : 참/거짓을 반복하면서 판단한다 거짓인 경우 for문을 벗어난다
		 * 
		 * 증감식 : 반복문을 제어하는 변수의 값을 증가 또는 감소시킨다.
		 * 
		 */
//		특별한 경우가 아니라면 코드는 위에서 아래로 그리고 왼쪽에서 오른쪽으로 수행 된다.
//		int i = 1;
		for (int i=1; i<=5; i++) {
			// 트루면 뒤에 실행이 안 된다.
			// 참이기에 syso를 출력하고 ++로 간다.
			// 마지막으로 6이 되면 나오게 된다.
			System.out.print(i + "번째 -");
			System.out.println("I can do it");
		}
		// 포문에서 변수 선언과 초기화를 해야한다. 대부분 i로 할당 된다. 포문 전용 변수.
//		System.out.println(i);// --> 블럭을 벗어났기에 i는 존재하지 않는다.
//		System.out.println("I can do it");
//		System.out.println("I can do it");
//		System.out.println("I can do it");
//		System.out.println("I can do it");
//		System.out.println("I can do it");

	}

}
