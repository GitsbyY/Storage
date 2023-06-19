package two;

public class StringEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----절대 원본 데이터를 변경하지 않는다---
		String originStr = "문자열 메서드를 활용HAJA하자"; //기준
		String changeStr = ""; //결과
		
//		기존의 문자열에서  영어로 적힌 부분을 모두 소문자로 하여 출력
//		활용(haja)하자
		changeStr = originStr.replace("HAJA", "(haja)");
//		changeStr = originStr.replaceAll("HAJA", "(haja)"); //All은 정규표현식도 포함된다.
		//----출력 결과는 건드리지 않는다---
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
		
		
	}

}
