
public class Ch5ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
	
		
		int scoreArr[] = new int[4];

		for(int i = 0; i <4; i++) {
			scoreArr[i] = (i+1) * 10;
			System.out.println(scoreArr[i]);
		}
		
		if(num1 == 0) {
			num1 = num1 + 10;
			System.out.println(num1);
		} 	
		if(num2 == 0) {
			num2 = num2 + 20;
			System.out.println(num2);
		}
		if(num3 == 0) {
			num3 = num3 + 30;
			System.out.println(num3);
		}
		if(num4 == 0) {
				num4 = num4 + 40;
				System.out.println(num4);
		}
		
	}

}
