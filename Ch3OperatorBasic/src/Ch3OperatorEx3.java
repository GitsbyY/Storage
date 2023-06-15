
public class Ch3OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	   단항 연산자
	   
	   증감 연산자 ++, --
	   
              증가 연산자(++)
              피연산자의 값을 1 증가시킨다
              
              감소 연산자 (--)
              피연산자의 값을 1 감소시킨다
        
              전위형 : 값이 참조되기 전에 증가시킨다. ++num;
              후위형 : 값이 참조 된 후에 증가시킨다 num++;
*/		
		
		int num = 0 ;
		
		//num++;
		//num = num +1; 긴 연산을 단축시켰다.
		System.out.println(num);
		++num;
		System.out.println(num);
		
		
	}

}
