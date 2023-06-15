
public class TypeDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		실수형
//							크기
//		float	정밀도 7자리	4byte
//		double	정밀도 15자리	8byte
//		
//		실수형 타입을 선택 할 때는 값의 범위 뿐만 아니라 정밀도도 고려해야 한다.
		
		
//		float f = 9.123456789f;
//		double d = 9.1234567890123456789d;
		float f = 9.123456789f;
		double d = 9.1234567890123456789;

		d = 9.1234567890123456789;   //9.123456이라는 값이 오른쪽에 존재한다.
									 //그 숫자를 읽고 컴파일러가 해석을 해준다.
									 // 명시의 영역  vs 묵시의 영역 
									 //묵시적으로 생략 된 것은 자동으로 해석이 되는 것이다.
		System.out.println(f);
		System.out.println(d);
		
	}

}
