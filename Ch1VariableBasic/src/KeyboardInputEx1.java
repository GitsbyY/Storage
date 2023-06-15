import java.util.Scanner;
//Scanner 는 입력을 할 수 있게 만드는 툴 중에 하나.
//Scanner 는 상호작용이기 때문에 바로 모든 코드가 출력되지 않는다.
public class KeyboardInputEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자 하나를 입력 해 주세요.");
		num = scan.nextInt();
		
		System.out.print("당신이 입력한 숫자는 : ");
		System.out.println(num + " 입니다.");
		
	}

}
