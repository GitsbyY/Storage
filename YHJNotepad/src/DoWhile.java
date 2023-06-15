import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		int count = 1;
		
		do {
			System.out.print("1과 100 사이의 숫자를 입력하세요. >> ");
			input = scan.nextInt();
			count++;
			if(input > answer) {
				System.out.println("더 작은 수로 시도 해 보십시오.");
			}else if (input < answer) {
				System.out.println("더 큰 수로 시도 해 보십시오.");
			}
			
		}while(input != answer || count < 6);
		
		if(count > 6) {
			System.out.println("실패하셨습니다. ");
		}
		System.out.println("맞췄습니다!");
			
	}

}
