package two;

public class StringEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----절대 원본 데이터를 변경하지 않는다---
		String originStr = "He is a good basketball player. He can run as fast as me."; //기준
		int strCount = 0; //결과
		int strCount1 = 0;
		int strCount2 = 0;
		int strCount3 = 0;
		int strCount4 = 0;
		int strCount5 = 0;
		
		//문자열 안에 as가 몇 개 존재하는지 출력하시오		
		strCount = (originStr.length() 
				- originStr.replace("as", "").length())/2;
		
		String[] originStrArr = originStr.split(" ");
	      
	      for (int i = 0; i < originStrArr.length; i++) {
	         if(originStrArr[i].contains("as")) {
	            strCount1++;
	         }
	      }
	      //절차나 방법론에 따라서 만든 코드 진원
	      for (int i = 0; i < originStr.length(); i++) {
	          if(originStr.indexOf("as", i) > 0 ) {
	             strCount2++;
	             i = originStr.indexOf("as", i);
	          }
	       }
	     //공식이나 패턴을 찾아서 만든 코드 진훈
	     String conditionStr = "as";
	      
	     strCount3 = (originStr.length() - originStr.replace("as", "").length())
	               / conditionStr.length();
		
	     //태윤님
	     for(int i = 0; i < originStr.length() - 1; i++) {
	         if((String.valueOf(originStr.charAt(i)) 
	        		 + String.valueOf(originStr.charAt(i + 1))).equals("as")) {
	            strCount4++;
	         }
	         
	     //태윤님2    
	     if(String.valueOf(originStr.charAt(i)).equals("a") 
	        		 && String.valueOf(originStr.charAt(i+1)).equals("s")) {
	            strCount5++;
	         }
	      }
	     //----출력 결과는 건드리지 않는다---
		System.out.println(originStr);
		System.out.println(strCount);
		System.out.println(strCount1);
		System.out.println(strCount2);
		System.out.println(strCount3);
		System.out.println(strCount4);
		System.out.println(strCount5);
	}

}
