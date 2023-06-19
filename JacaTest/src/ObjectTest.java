//import java.util.Scanner;
public class ObjectTest {
//조건문 테스트
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		윤년구하기

//		System.out.println("연도를 입력하시오.");

//		Scanner scan = new Scanner(System.in);
		
//		int year = scan.nextInt();
		
		for (int i = 1900; i <= 2024; i++) {
			
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				System.out.println(i + "년은 윤년");
			} 
			else {
				System.out.println(i + "년은 평년-----");
			}
		}
		
		
		
		
	}

}
