
public class Ch5ArrayEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numArr = new int [8][9];
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length; j++) {
				numArr[i-1][j] = i*j;
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.print((i+2) + " 단 : ");
			System.out.println();
			System.out.println();
		}
		
		
	}

}
