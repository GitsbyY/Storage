import java.util.Scanner;

public class RockSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();//화면을 통해 입력받은 숫자를 유저에 저장
		int com = (int)(Math.random()*3) + 1 ;//1,2,3 중 하나의 숫자가 컴에 저장
		
		System.out.println("당신은 " + user + " 입니다.");
		System.out.println("컴퓨터는 " + com + " 입니다.");
		
		for (int i = 0; i < 6; i++) {
			int count = 1;
			count++;
		switch(user-com) {
			case 2 : case -1 :
				System.out.println("You Loose");
				break;
			case 1 : case -2 :
			    System.out.println("You Win");
			    break;	
			case 0 :
				System.out.println("even.");
				break;
		 }
		
		}	
		
	}

}
