import java.util.Scanner;

public class ScoreProcessTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		사계절
//		봄여름가을겨울
//		1-12
//		
//		스위치
//		
//		출력예시 
//		현재 월을 입력하세요.>3
//		현재의 계절은 봄입니다.
	   
		
		String str = "";
		Scanner scan = new Scanner(System.in);
		int monthNum = 0;
	
		System.out.print("현재의 월을 입력하세요. >");
		monthNum = scan.nextInt();
		
		switch (monthNum) {
			case 12: case 1: case 2:
				str = "현재의 계절은 겨울입니다.";
				break;
			case 3: case 4: case 5:
				str = "현재의 계절은 봄입니다.";
				break;
			case 6: case 7: case 8:
				str = "현재의 계절은 여름입니다.";
				break;
			case 9: case 10: case 11:
				str = "현재의 계절은 여름입니다.";
				break;
			default:
				str = "1~12 사이의 숫자를 입력해주세요.";
				break;
		}
		System.out.println(str);
		//범위를 크게 잡을 때는 if 구문을 써야 한다. 
		//switch로 할 수 있는 건 if문으로 할 수 있다.
	}
}
