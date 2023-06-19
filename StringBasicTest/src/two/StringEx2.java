package two;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----절대 원본 데이터를 변경하지 않는다---
		String originStr = "문자열 메서드를 활용haja하자";
		int strLength = 0; //결과
		String resultStr = "";
		//		
		
		strLength = originStr.length();
//		resultStr = originStr.substring(strLength-3, strLength-2);
		resultStr = String.valueOf(originStr.charAt(strLength-3));
//		resultStr = originStr.charAt(strLength-3) + "";
		
		//----출력 결과는 건드리지 않는다---
		System.out.println(originStr);
		System.out.println(strLength);
		System.out.println(resultStr);
		
		
		
		
	}

}
