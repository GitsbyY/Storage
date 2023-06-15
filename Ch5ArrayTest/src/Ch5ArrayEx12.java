
public class Ch5ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1~5의 숫자를 배열에 입력한다
//		
//		이들을 내림차순으로 정렬한다
//		순차적으로 출력한다

//		출력형태
//		5
//		4
//		3
//		2
//		1

		int[] numArr = new int[5];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			
			for (int j = i; j < numArr.length; j++) {
				
				if(numArr[i] > numArr[j]) {
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
			}
				}
			}
		

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i] + " ");
		}
	}

}
