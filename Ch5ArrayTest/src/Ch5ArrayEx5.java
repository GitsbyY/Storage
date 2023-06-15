import java.util.Scanner;

public class Ch5ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int pocket = 0;
		
		String user = "";
		
		int oddeven = 0;
		
		int win = 0;

		while (true) {
	
			pocket = (int) (Math.random() * 10) + 1;
			
			if(pocket%2 != 0) {
				oddeven = 1;
			}else if(pocket%2 == 0) {
				oddeven = 2;
			}
	
			System.out.print("1. 홀   2. 짝  (숫자를 입력하세요)>>");
			
			user = scanner.nextLine();
		
			switch(user) 
			
			{
		
			case "1" :
				System.out.println("당신은 홀수를 선택하였습니다!");
				
				System.out.print("구슬>>" + pocket + "개");
				
				if(oddeven == 1) {
					win++;
					System.out.println("  >>> 홀!");
					System.out.println("축하합니다 정답입니다.");
				}else {
					System.out.println("  >>> 짝!");
					System.out.println("틀렸습니다.");
				}
				
				System.out.println();
				
				break;
			
			case "2":
				System.out.println("당신은 짝수를 선택하였습니다!");
				System.out.print("구슬>>" + pocket + "개");
				
				if(oddeven == 2) {
					win++;
					System.out.println("  >>> 짝!");
					System.out.println("축하합니다 정답입니다.");
				}else {
					System.out.println("  >>> 홀!");
					System.out.println("틀렸습니다.");
				}
				
				System.out.println();
				break;
			
			}//swich끝
			
		} //while 끝
		
	}
}

