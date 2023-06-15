
public class Get100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int num = (int)(Math.random()*100 + 1);
		int exNum = 0;
		int count = 0;
		
		do {
			if( 100 < sum) {
				break;
			}
			num = exNum;
			sum = num + exNum;
			count++;
		}while (sum > 100);
		System.out.println("횟수 : " + count);
		System.out.println("sum = " + sum);
		
	}

}
