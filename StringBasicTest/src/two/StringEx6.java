package two;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----절대 원본 데이터를 변경하지 않는다---
		String originStr = "Hello.java"; //기준
		String fileName = ""; //결과
		String fileExtensionName = ""; //파일 확장자명
		
//		파일명과 파일 확장자 명을 출력하시오
//		ex : 
//			파일전체명 : Hello.java
//			파일명 : Hello
//			확장자명 : java
//		fileName = originStr.substring(0, 5);
//		fileExtensionName = originStr.substring(6);
		String [] arr = originStr.split("[.]");
//		String [] arr = originStr.split("\\.");
		fileName = arr[0];
		fileExtensionName = arr[1];
		//----출력 결과는 건드리지 않는다---
		System.out.println(originStr);
		System.out.println(fileName);
		System.out.println(fileExtensionName);
		
		
		
	}

}
