public class Ch4_2RefeatTest5 {

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
		int total = 0;
		
		
		while(total <= 100 ) {
			num++;
			total = total + num;
			
			//System.out.println(num + "+" + total+ "="+ total);
			
			System.out.println(total);
			
		}
		System.out.println();
		System.out.println(num + " 번째: " + (total));
		
		
	}//main
}//class



	


