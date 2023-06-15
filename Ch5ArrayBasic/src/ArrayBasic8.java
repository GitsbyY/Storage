
public class ArrayBasic8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열 특징 2
		
		int[] numArr = {
			1, 3, 5, 10, 7
		};
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		System.out.println();
		//오름차순 정령한다
		int tempNum = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length - 1; j++) {
				if(numArr[j] > numArr[j+1]) {
					tempNum = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tempNum;
				}
			}
		}//for end
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		
//		System.out.println(numArr);
//		System.out.println(numArr[0]);
//		System.out.println(numArr.length);
	
	}

}
