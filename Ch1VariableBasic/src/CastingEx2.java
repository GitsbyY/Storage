
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		형변환(Casting) 이란?
		
		형변환이란, 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
		
		방법
		(타입)피연산자
*/		
		
//		묵시적 
//		눈에 보이지 않지만 어딘가에서 처리되고 있음 => 자동
//		
//		명시적
//		눈에 보임, 명확하게 표시함 => 수동
		

		
		
		double d = 85.4;
		long bigNum = 3000000000L;//L을 붙여야 한다. 
		double score = 0;
		
		
//		score = d;
//		score = bigNum;           //틀릴 수 있는 가능성이 있으니 오류가 난다. 큰 친구는 작은 친구에게 X
//  	bigNum = (long)score;	  //작은 친구는 큰 친구에게 들어갈 수 있다.	(long)이 묵시적으로 생략.
		System.out.println(score);
		
		score = (int)d;
//		score = (int)bigNum;      // long->int로 변환. 타입이 동일 해 졌으니 담기고 실행이 된다.
								  // -1294967296이라고 나온다. int에서 가장 큰 값에서 밑으로 간다.
								  // 명시적으로 시켰기 때문에(int) 잃은 데이터를 인식하고 있다.
		System.out.println(d);
		System.out.println(score);
		
		
		
		
	}

}
