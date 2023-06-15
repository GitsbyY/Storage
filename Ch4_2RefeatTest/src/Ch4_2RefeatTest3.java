
public class Ch4_2RefeatTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문의 수행 방법을 알아보자 - 1
		// for문의 수행 방법을 알아보자 - 2
		// for문의 수행 방법을 알아보자 - 3
		// for문의 수행 방법을 알아보자 - 4
		// for문의 수행 방법을 알아보자 - 5

		// for문 종료됨 - 수행 횟수 : 5

		/*
		 * int num = 0; 
		 * for(int i =1 ; i <= 5; i++) { num = i;
		 * System.out.println("for문의 수행 방법을 알아보자 - " + i);
		 * }
		 * System.out.println("for문 종료됨 - 수행 횟수 : " + i);
		 */
		
		

		for (int i = 1; i <= 5; i++) {
			
			System.out.println("for문의 수행 방법을 알아보자 - " + i);
			if(i > 4) {
				System.out.println();
				System.out.println("for문 종료됨 - 수행 횟수 : " + i);	
			}//if
			
		}//for
	}//main
}//class



	


