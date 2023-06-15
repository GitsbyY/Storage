
public class Ch5ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numArr = new int[4][5];
		//int sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			//sum = sum + 10;
			for (int j = 0; j < numArr[i].length; j++) {
					//numArr[i][j] = sum;
					numArr[i][j] = (i+1)*10;
			}
		}
		
		for (int i = 0; i <numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
