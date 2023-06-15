public class Ch4_2RefeatTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문을 이번에는 활용하자

//		홀짝을 판별하는 프로그램을 만드시오

//		int num = 0;
//		
//		while(num <=5) {
//			num++;
//			
//			if(num%2 ==0) {
//				System.out.println(num);
//				System.out.println("짝");
//			}else if(num%2 !=0) {
//				System.out.println(num);
//				System.out.println("홀");
//			}

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				System.out.println("짝");
			} else if (i % 2 != 0) {
				System.out.println("홀");
			}

		}

	}// main
}// class
