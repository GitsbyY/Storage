package two;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----절대 원본 데이터를 변경하지 않는다---
		String originStr = "문자열 메서드를 활용haja하자";
		String firstStr = ""; //결과
		String secondStr = ""; //결과
		String thirdStr = ""; //결과
		
//		각각 단어를 분리하려 출력하시오
//		ex :(공백이 없다)
//			문자열
//			메서드를
//			활용HAJA하자
		String [] arr = originStr.split(" ");
		firstStr = arr[0];
//		firstStr = firstStr.trim();
		secondStr = arr[1];
//		secondStr = secondStr.trim();
		thirdStr = arr[2];
		thirdStr = thirdStr.toUpperCase();
//		SthirdStr = thirdStr.trim();
		//----출력 결과는 건드리지 않는다---
		System.out.println(originStr);
		System.out.println(firstStr);
		System.out.println(secondStr);
		System.out.println(thirdStr);
		
		
	}

}
