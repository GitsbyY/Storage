import java.util.Scanner;

public class RandomSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int user = 0;
		int randNum = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("난수의 개수를 입력하세요");
		
		user = sc.nextInt();
		System.out.println();
		
		System.out.println("==== 난수의 숫자들 ====");
		for (int i = 0; i < user; i++) {
			randNum = (int) (Math.random() * 10 + 1);
			sum = sum + randNum;
			System.out.print(randNum);
			if (i < user - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("==== 1~10 사이의 난수 4개의 합계 ====");
		System.out.println(sum);
	}
	
}
