package four;

public class ForEachTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		숫자 3의 배수로 10번째까지 배열에 담는다

		int[] numArr = new int[10];
		int number = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (i + 1) * 3;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			int num = numArr[i];
			System.out.println(i + "번째: " + num);
		}
		
		for (int num : numArr) {
			number++;
			System.out.println(number + "번째: " + num);

		}
		
		
		
		
	}

}
