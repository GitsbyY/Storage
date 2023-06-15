import java.util.Scanner;

public class ScoreProcessTest5 {

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
		int monthNum = scan.nextInt();
	
		System.out.print("현재의 월을 입력하세요" + monthNum);
		
		
		switch (monthNum) {
		case 1:
			str = "현재의 계절은 겨울입니다.";
			break;
		case 2:
			str = "현재의 계절은 겨울입니다.";
			break;
		case 3:
			str = "현재의 계절은 봄입니다.";
			break;
		case 4:
			str = "현재의 계절은 봄입니다.";
			break;
		case 5:
			str = "현재의 계절은 봄입니다.";
			break;
		case 6:
			str = "현재의 계절은 여름입니다.";
			break;
		case 7:
			str = "현재의 계절은 여름입니다.";
			break;
		case 8:
			str = "현재의 계절은 여름입니다.";
			break;
		case 9:
			str = "현재의 계절은 가을입니다.";
			break;
		case 10:
			str = "현재의 계절은 가을입니다.";
			break;
		case 11:
			str = "현재의 계절은 가을입니다.";
			break;
		case 12:
			str = "현재의 계절은 겨울입니다.";
			break;
			
		default:
			str = "존재하지 않은 달 입니다.";
			break;
		}
		
		System.out.println(str);
		
		
		
		
	}
}
