import java.util.Scanner;

public class OddEvenTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//홀짝 찾기 
//		출력 ex
//		1
//		1은 홀입니다
//
//		10
//		10은 짝입니다
		Scanner sc = new Scanner(System.in);
		
		int b = 14;
		int str = sc.nextInt();
		
		String resultStr = "";
		String resultStr1 = "";
		
		
		resultStr = (b%2 == 0) ? "짝 입니다." : "홀 입니다.";
		resultStr1 = (str%2 == 0) ? "짝 입니다." : "홀 입니다.";
		
		System.out.println(b);
		System.out.println(b + "은 " +resultStr);
		
		System.out.println(str);
		System.out.println(str + "은 " +resultStr1);
		
	}

}
