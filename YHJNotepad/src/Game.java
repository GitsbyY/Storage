import java.util.Scanner;

public class Game {

	 public static void main(String[] args) {
	      // TODO Auto-generated method stub

	      int user = 0;
	      int com = 0;
	      int win = 0;
	      int loose = 0;
	      int num = 0;
	      int money = 5000;
	      int answer = 0;
	      Scanner scan = new Scanner(System.in);
//	      System.out.println("게임비 : 5000원");
	      System.out.print("판돈을 입력하세요");
	      money = scan.nextInt();
	      System.out.println("1.홀, 2. 짝 중 하나를 고르세요");
	      for (int i = 0; i < 5; i++) {
//	         5판을 진행할때까지 프로그램을 돌린다.
	         user = scan.nextInt();
	         ++num;
	         System.out.println(num + "회");
//	         num은 진행 횟수로 입력할때마다 증가한다.
	         com = (int) (Math.random() * 10) + 1;
	         System.out.println("구슬의 숫자는 : " + com + "개 입니다.");
//	         com은 랜덤한 숫자가 저장
	         if (com % 2 == 0) {
//	         com의 나머지 2로 나눌시 0이면 프로그램을 진행한다.
	            answer = 1;
//	            user와 com의 값을 일치 시키기 위해 answer을 짝이라고 저장해준다.
	            switch (user) {
	            case 1:
	               System.out.println("정답입니다." + "사용자(짝)  컴퓨터 (짝)");
	               ++win;
	               break;
	            case 2:
	               System.out.println("오답입니다." + "사용자(홀)  컴퓨터 (짝)");
	               ++loose;
	               break;
	            default: {
	               System.out.println("홀 또는 짝을 다시 입력해주세요");
	               --i;
	               break;
	            }
	            }
	         } else {
	            answer = 2;
	            switch (user) {
	            case 1:
	            	
	               System.out.println("정답입니다." + "사용자(홀)  컴퓨터 (홀)");
	               ++win;
	               break;
	            case 2:
	            	
	               System.out.println("오답입니다." + "사용자(짝)  컴퓨터 (홀)");
	               ++loose;
	               break;
	            default: {
	               System.out.println("홀 또는 짝을 다시 입력해주세요");
	               --i;
	               break;
	            }
	            }

	         }
	         if (win == 3) {
	            System.out.println("승리하셨습니다.");
	            break;
//	            switch문에서 정답일시 win이 증가하고 3과 같을시 가장 가까운 for문 종료
	         } else if (loose == 3) {
	            System.out.println("패배하셨습니다.");
	            break;
//	            switch문에서 오답일시 loose이 증가하고 3과 같을시 가장 가까운 for문 종료
	         }
	      }
	      money = money * win;
	      System.out.println("따신 돈은 : " + money + "원 입니다.");
	   }
	}


