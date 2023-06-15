import java.util.Scanner;
//Scanner 는 입력을 할 수 있게 만드는 툴 중에 하나.
//Scanner 는 상호작용이기 때문에 바로 모든 코드가 출력되지 않는다.
public class KeyboardInputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("숫자 하나를 입력 해 주세요.");
		num = scan.nextInt();
		
		System.out.print("당신이 입력한 숫자는 : ");
		System.out.println(num * 10 + " 입니다.");
*/
		//좋은 코드는 쉽게 짠 코드. 그리고 하나는 하나만 하는 것을 중요하다.
		
/*		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자 하나를 입력 해 주세요.");
		num = scan.nextInt();
		
		int num2 = num * 10;
		
		System.out.print("당신이 입력한 숫자는 : ");
		System.out.println(num2 + " 입니다.");
*/
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num2 = num * 10;
		//코드의 순서에 따라 작용 됨으로써 무슨 숫자를 해도 0이 나온다.
		System.out.println("숫자 하나를 입력 해 주세요.");
		num = scan.nextInt();
		
		System.out.print("당신이 입력한 숫자는 : ");
		System.out.println(num2 + " 입니다.");
	}

}
