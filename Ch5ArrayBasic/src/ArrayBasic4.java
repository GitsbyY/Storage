
public class ArrayBasic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열(Array)이란?
				
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
//		서로 다른 타입의 변수들로 구성된 배열은 만들 수 없다.
		
//		타입  변수명[] = new 타입[변수 생성 갯수 or 길이]
		int[] numberArr = new int[4];
		int number = 0;
		
		
		for(int i = 0; i < 3; i++) {
			number = number + 1;
		}
		for(int i = 0; i < 3; i++) {
			numberArr[i] = number + i;
		}
		for(int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i] + "\t");
			number = number + numberArr[i];
		}
		System.out.println(number);
	}

}
