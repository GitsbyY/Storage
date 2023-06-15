
public class TypeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		  정수형 
		 byte  <  short  <  int  <  long 
		 크기(size)
		 1  	  2		    4		8
		 
		단위 
		bit
		
		1byte = 2의 8승 -> 256 정수형에는 +와 -를 포함한다. -> -128 ~ +127 (256가지 표현)
		값의 제한(범위)  --> 저장가능한 값의 범위
		long 의 단위는? 922경 ~ -922경
		*/
		
		byte byteValue = 127;
		byte byteValue1 = (byte)130; //byte에서 초과되는 것을 억지로 집어 넣으면 위로 올라간다. [보수]
		int intValue = 1000;
		long longValue = 1000;
		
		System.out.println("byteValue:\t" + byteValue);
		System.out.println("byteValue1:\t" + byteValue1);
		System.out.println("intValue:\t"  + intValue);
		System.out.println("longValue:\t" + longValue);
		
		
//		byteValue = intValue; 변수의 값이라고 하더라도 정해지지 않은 값이기에 변수로 안 된다.
//		intValue = longValue;
//		byteValue = 100;
		
		  
		 System.out.println("byteValue:\t" + byteValue);
		 System.out.println("intValue:\t" + intValue);
			
	}

}
