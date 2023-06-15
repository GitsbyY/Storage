
public class Ch5ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 길이가 10개인 배열을 만든다
//		배열 안에는 순차적으로 10 20 30 이라는 숫자를 저장한다
//		
//		이들의 값을 순차적으로 출력하시오
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		int scoreArr[] = new int[4];
		
//		scoreArr[0] = 10;
//		scoreArr[1] = 20;
//		scoreArr[2] = 30;
//		scoreArr[3] = 40;
		
		for(int i = 0; i <4; i++) {
			scoreArr[i] = (i+1) * 10;
			System.out.println(scoreArr[i]);
		}
	
//		System.out.println(scoreArr[0]);
//		System.out.println(scoreArr[1]);
//		System.out.println(scoreArr[2]);
//		System.out.println(scoreArr[3]);
		
		
		
	}

}
