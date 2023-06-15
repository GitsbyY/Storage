import java.util.Scanner;

public class Ch5ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		총점과 평균을 구하자
		
//		국영수 3개의 점수의 총점과 평균구하기
//		평균은 소수점 3번째에서 올림한다.
		
//		총점 : ???
//		평균 : ???
		
		Scanner sc = new Scanner(System.in);
		
		double kor = 0;
		double math = 0;
		double eng = 0;
		
		double sum [] = new double[2];
		double avg [] = new double[2];
		
		for(int i = 0; i < 3; i++) 
		{
		System.out.print("국어 점수 : ");
		kor = sc.nextDouble();
		System.out.print("수학 점수 : ");
		math = sc.nextDouble();
		System.out.print("영어 점수 : ");
		eng = sc.nextDouble();
		
		sum[i] = ((int)(kor + math + eng)* 100 + 1) / 100.0;
		avg[i] = ((int)(sum[i]/3 * 100 + 1)/100.0);
		System.out.println();
		System.out.println("총점 : " + sum[i]);
		System.out.println("평균 : " + avg[i]);
		
		
		}
		
    
	}

}
