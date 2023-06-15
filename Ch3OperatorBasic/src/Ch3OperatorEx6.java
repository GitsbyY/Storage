
public class Ch3OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		논리 연산자
//		
//		||(or 연산자) ; 피연사자 중 어느 한 쪽만 true이면 true 결과를 얻는다. 
//		&&(and 연산자) ; 피연사 양 쪽 모두 true이어야 true를 결과로 얻는다.

		//		쌍 연산자는 앞에서 결과값이 나오면 뒤에서는 수식을 계산하지 않는다.

//		|(or 연산자) ; 피연사자 중 어느 한 쪽만 true이면 true 결과를 얻는다. 
//		&(and 연산자) ; 피연사 양 쪽 모두 true이어야 true를 결과로 얻는다.

		//		앞에서 결과가 맞아도 뒤의 수식까지 계산한다.
		
		int x = 10;
		int y = 8;
		
		System.out.println(x == y && x != y); 
		System.out.println(x != y && x > y); 
		System.out.println(x > y || x < y);
		System.out.println(x < y || x == y);
	
//		System.out.println(10 <= x < 20); // 왼쪽부터 수행 되어야 하는데 true < 20 이 된다.
		System.out.println(10 <= x && x < 20);
		
	}

}
