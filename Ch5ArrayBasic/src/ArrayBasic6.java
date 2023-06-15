
public class ArrayBasic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		섞는다라는 개념?
		
		int[] ballArr = new int[45];
		
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i+1;
		}
		
		int tempNum = 0;
		int randNum = 0;
		//치환이라는 개념!!!
		for (int i = 0; i < 6; i++) {
			randNum = (int)(Math.random() * 45);
			tempNum = ballArr[i];
			ballArr[i] = ballArr[randNum];
			ballArr[randNum] = tempNum;
			//System.out.print(ballArr[i] + "\t"); 따로 쓰는 이유
			//객체지향이기에 값을 계산하는 것과 출력하는 부분을 나누는 것이 좋다.
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] + "\t");
		}
		
	}

}
