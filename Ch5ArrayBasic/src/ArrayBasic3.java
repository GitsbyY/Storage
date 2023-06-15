
public class ArrayBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열(Array)이란?
				
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
//		서로 다른 타입의 변수들로 구성된 배열은 만들 수 없다.
		
//		타입  변수명[] = new 타입[변수 생성 갯수 or 길이]
		int numberArr[] = new int[4];
//		인덱스 표시, 배열 표시
		
		for(int i = 0; i < 4; i++) {
			numberArr[0] = 1;
			
		}
		for(int i = 0; i < 4; i++) {
			System.out.println(numberArr[i]);
		}
		
	}

}
