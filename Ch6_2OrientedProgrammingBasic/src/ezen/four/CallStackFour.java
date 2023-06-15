package ezen.four;

public class CallStackFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempClass tc = new TempClass();
		TempClass tc2 = new TempClass();
		System.out.println("main 시작");
		tc.firstMethod();
		tc2.firstMethod();
		System.out.println("main 끝");
	}

}
