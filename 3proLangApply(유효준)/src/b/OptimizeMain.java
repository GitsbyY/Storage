package b;

public class OptimizeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inquire();
	}

	static void inquire() {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
		}
		
		for (int j = 0; j < 2; j++) {
			
			System.out.println("숫자를 조회합니다.");

			for (int i = 0; i < numArr.length; i++) {
				System.out.print(numArr[i] + " ");
			}

			System.out.println();

		}
		
	}

}