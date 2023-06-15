
public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열(Array)이란?
				
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
//		서로 다른 타입의 변수들로 구성된 배열은 만들 수 없다.
		
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int score4 = 0;
		int score5 = 0;
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(score5);
		
		
//		선언방법
//		타입  변수명[] = new 타입[변수 생성 갯수 or 길이]
		int scoreArr[] = new int[5];
//		인덱스 표시, 배열 표시
		scoreArr[0] = 1;
		scoreArr[1] = 2;
		scoreArr[2] = 3;
		scoreArr[3] = 4;
		scoreArr[4] = 5;
		
		System.out.println(scoreArr[0]);
		System.out.println(scoreArr[1]);
		System.out.println(scoreArr[2]);
		System.out.println(scoreArr[3]);
		System.out.println(scoreArr[4]);
		
		
		
	}

}
