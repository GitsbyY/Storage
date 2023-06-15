import java.util.Scanner;

public class CalculaterExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		키보드로 두 개의 숫자를 입력받는다
		
//		두 숫자를 곱한다
		
//		결과를 출력한다
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
//		1. 두개의 변수를 선언 -> 3개의 변수를 선언
		int i = 0;
		int n = 0;
//		long in = i * n;
		//여기에 변수를 선언하면 할 당 된 초기값이 있어서 0으로 나온다
//		2. 키보드 입력 선언

//		3. 사용자에게 숫자를 입력하라는 메세지 출력
		System.out.println("사용자님 첫 번째 숫자를 입력 해 주세요.");
		i = scan.nextInt();
		System.out.println("사용자님 두 번째 숫자를 입력 해 주세요.");
		n = scan.nextInt();
//		4. 변수에 할당
		long in = (i * n);
//		5. 결과 출력4
		
//		System.out.println("\n" + "결과 : " + (i * n) + "\n" + "프로그램을 종료합니다.");
		//될 거라고 생각했지만, 안 된다. 안 되는건 안 되는거다.
		
		System.out.print('\n' + "결과 : ");
		System.out.println( in + " 입니다.");
		System.out.println('\n' + "프로그램을 종료합니다.");
//		출력 형태

//		사용자님 첫 번째 숫자를 입력 해 주세요
//		120000
	
//		사용자님 두 번째 숫자를 입력 해 주세요
//		100000
		
//		결과 : 120
		
//		프로그램을 종료합니다.
		
		
		
		
	}

}
