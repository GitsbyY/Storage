import java.util.Scanner;

public class Ch5ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		키보드로 짝의 나이를 입력받는다.
//		자신의 짝의 이름을 배열에 담으시오
//		대충 3명
//		각 짝의 나이를 배열에 담으시오
//		모든 짝의 평균 나이를 출력하시오
//		소수점 3자리에서 반올림
//		ㅇㅇㅇ 나이 :
			
//		평균나이 : 27.666
		
		
		Scanner sc = new Scanner(System.in);

		
		double sum = 0;
		double avg = 0;
		double[] ageArr = new double[4];
		
		System.out.print("손지원 나이 : ");
		ageArr[0] = sc.nextDouble();
		System.out.print("조남용 나이 : ");
		ageArr[1] = sc.nextDouble();
		System.out.print("임찬우 나이 : ");
		ageArr[2] = sc.nextDouble();
		System.out.print("유효준 나이 : ");
		ageArr[3] = sc.nextDouble();
			
		sum = ageArr[0] + ageArr[1] + ageArr[2] + ageArr[3];
		avg = ((int)(sum/4 * 100 + 0.5)/100.0);
		
		
		System.out.println();
		System.out.println("총나이 : " + sum);
		System.out.println("평균 나이 : " + avg);
	}

}
