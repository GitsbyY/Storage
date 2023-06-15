public class Ch4_JUNFlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		break문
//		자신이 포함 된 가장 가까운 반복문을 벗어난다
		
		int sum = 0;
		int cnt = 0;
//		무한루프
		while(true) {
			if(sum > 100) {
				break;
			}
			cnt++;
			sum = sum + cnt;
		}
		
		System.out.println(sum);
	}
}
