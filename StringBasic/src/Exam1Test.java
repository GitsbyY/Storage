import java.util.Scanner;

public class Exam1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		String str = null;
		
		System.out.println("글자 입력해봐");
		str = scan.nextLine();
		//str 의 주소를 가져오는 것이라서 false
		System.out.println(str == "어쩌지");
		//equals는 str의 안에 있는 값을 비교하기에 true
		System.out.println(str.equals("정말?"));
	}

}
