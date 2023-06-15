public class Ch4_2RefeatTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		0+1 1
//		1+2 3
//		3+3 6
//		6+4 10
//		,
//		,
//		,
//		78 ----100을 넘는 숫자가 무엇인가?
		int num = 0;
		int num1 = 0;
		int total = 0;
		
		while(num + num1 <= 105 ) {
			num1++;
		    total = num + num1;
			System.out.println(total);
			
		}
		
		System.out.println(num1 + " 번째: " + num );
		
		
	}//main
}//class



	


