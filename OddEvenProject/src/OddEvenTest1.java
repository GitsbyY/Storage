import java.util.Scanner;

public class OddEvenTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Com com = new Com();
		
//		0이면 짝, 1이면 홀
		int myChoiceNum = 0;
		
		int comChoiceNum = 0;
		String resultStr = "";
		comChoiceNum = com.setRandomNum();
		
		for (int i = 0; i < 2; i++) {
		
			System.out.println("홀짝이 입력되었습니다");
			
			System.out.println("홀은 1, 짝은 0을 입력해주세요");
			myChoiceNum = scan.nextInt();
			
			if((comChoiceNum % 2 == 0) && (myChoiceNum % 2 == 0)) {
				resultStr = "맞추셨습니다 ";
			}else {
				resultStr = "틀렸습니다 ";
			}
			
//			System.out.println("user: " + myChoiceNum 
//				+ "/ com : " + comChoiceNum);
			System.out.println(resultStr);
		}
		
		
	}

}
