public class Ch4_2RefeatTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3의 배수
		int sum = 0;
		int num = 1;

		while (num < 10) {
			if (num % 3 != 0) {
				sum = sum + num;
				//System.out.println(sum);
				System.out.println(num);
			}
			num++;
		}
		
		System.out.println(sum);
	}// main
}// class
