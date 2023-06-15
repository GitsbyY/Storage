public class Ch4_JUNFlowEtc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 0; a < 1; a++) {//첫번째 for문은 라인을 담당한다.
			System.out.println("*");
			for (int b = 0; b < 1; b++) {//내부의 for문은 칸을 담당한다.
				System.out.println("**");
			}
			for (int b = 0; b < 1; b++) {
				System.out.println("***");
			}
		}
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		
	}
}
