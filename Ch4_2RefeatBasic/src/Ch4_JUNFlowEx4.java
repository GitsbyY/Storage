import java.util.Scanner;

public class Ch4_JUNFlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//UP & DOWN
		
		int input = 0;
		int answer = 0;
		
		
		Scanner scan = new Scanner(System.in);
		answer = (int)(Math.random() *20) +1;
		
		boolean flag = true;
		//불린 중요!
		
		while(flag) {
			//값으로 true를 주면 원하는 값이 나올 때가지 돌아간다. 무한루프.
			//while은 꼭 수식을 넣지 않아도 된다.
			System.out.print("1과 20사이의 정수를 입력해주세요 : ");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 입력해주세요");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 입력해주세요");
			}else {
				flag = false;
			}
			
		}
		System.out.println("정답을 맞추셨습니다!");
		System.out.println("님이 입력 한 값 : " + input);
		System.out.println("정답 값: " + answer);
		System.out.println("다음에 또 이용해 주세요.");
	}

}
