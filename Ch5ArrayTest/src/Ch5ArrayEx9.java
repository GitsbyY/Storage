
public class Ch5ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numArr[] = {78, 88, 91, 33};
		
		int max = 0; 
		int min = 0;
		//변수는 언제든 사용 가능 할 수 있게 따로 선언을 한다.
		max = numArr[0]; 
		min = numArr[0];
		
		
		for(int i = 0; i < 4; i++) {
		    if(max < numArr[i]) {
		    	max = numArr[i];
		    }
		    if(min > numArr[i]) {
		    	min = numArr[i];
		    }
		}		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
