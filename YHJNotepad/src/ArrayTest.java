
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dan = new int[8][9]; //구구단 값 저장을 위한 배열 생성
		
		for(int i = 0; i<8; i++) {//단수 (행)반복
			for(int j = 0; j<9; j++) {//곱하기(열) 반복
				dan[i][j] = (i+2)*(j+1);//배열에 값 저장
				System.out.print((i+2)+"x"+(j+1)+"="+dan[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
	

}
