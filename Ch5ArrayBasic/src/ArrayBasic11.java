
public class ArrayBasic11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열
		
//		선언 방법
//		타입 [][] 변수명
		
		int[][] numArr = new int[2][3];
//		alt + shift + a 
		numArr[0][0] = 1;
		numArr[0][1] = 2;
		numArr[0][2] = 3;
		numArr[1][0] = 4;
		numArr[1][1] = 5;
		numArr[1][2] = 6;
		
		System.out.println(numArr[0][0]);
		System.out.println(numArr[0][1]);
		System.out.println(numArr[0][2]);
		System.out.println(numArr[1][0]);
		System.out.println(numArr[1][1]);
		System.out.println(numArr[1][2]);
		
		
		
	}

}
