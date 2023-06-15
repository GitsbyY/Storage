import java.util.Scanner;

public class Ch4_1ConditionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if
//		else
		
//		홀 짝 판별 프로그램을 만드시오.
		
//		사용자로부터 입력을 받음.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("홀짝? ");
		int num = sc.nextInt();
		
		if(num % 2 == 0 ) {	
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}
		
		
		
		
	}

}
