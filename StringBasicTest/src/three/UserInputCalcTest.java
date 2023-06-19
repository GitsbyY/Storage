package three;

import java.util.Scanner;

public class UserInputCalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		사용자로부터 숫자를 입력받아서
//		무조건 10을 곱하는 프로그램을 완성하시오
		
//		단, 사용자로부터 입력받을때 무조건 line메서드사용
		
		String tempI = "";
		int iVar = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		tempI = sc.nextLine();
		iVar = Integer.parseInt(tempI);
		
		System.out.println("입력하신 숫자" +  "*" + " 10" + "=" + iVar * 10 + "입니다.");
		
		
	}

}
