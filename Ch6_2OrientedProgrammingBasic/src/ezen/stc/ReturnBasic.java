package ezen.stc;

public class ReturnBasic {
	
	int sumPrint(int n, int m) {
		
		int sum = 0;
		
		for (int i = n; i <= m; i++) {
			sum = sum + i;
			if(sum>100) {
				return sum; //리턴을 맞이하면 바로 값이 나온다.
				//System.out.println();리턴 이후에는 코드를 작성 할 수 없다.
				//리턴을 맞이하면 바로 밑으로 간다. 끝으로 간다.
			}
			
		}
		
		return sum;//return이 수행되고 나서 언제 갔다가 돌아와서 블럭을 만나 끝나냐.
				   //return을 만나면 무조건 그 메서드는 종료된다.
	}
	//void는 반환 할게 없다고 하지만 그 안에 return이 포함된다.
	
	
}
