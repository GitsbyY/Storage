package one;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleStr = "커피";
		
		String sampleStr2 = new String("콜라");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열 하나 입력해 봐 마실걸로");
		String sampleStr3 = scan.nextLine();
		
//		조건문을 사용하여 위 3개의 문자열이 맞을 경우 
//		맛있다 맛없다를 본인의 입맛으로 표현하시오
//		
//		ex: 
//		커피 값을 비교해서 true인 경우 
//		커피 맛있다 등등
//		System.out.println(sampleStr3 == "커피");
		if(sampleStr3.equals("커피")) {
		
			if(sampleStr.equals(sampleStr3)){
				System.out.println("역시 커피는 필수지.");
			}else {
				System.out.println("이건 커피가 아니잖아!");
			}
		}
		
		if(sampleStr3.equals("콜라")) {
			if(sampleStr2.equals(sampleStr3)) {
				System.out.println("코카콜라가 괜히 돈을 많이 버는게 아니야...");
			}else {
				System.out.println("이건 콜라가 아니잖아!");
			}
		}	
//
//		if(sampleStr == "커피") {
//			System.out.println(sampleStr+"맛있다");
//		}
//		
//		if(sampleStr2.equals("콜라")) {
//			System.out.println(sampleStr2+"맛있다");
//		}
//		
//		if(sampleStr3.equals("사이다")) {
//			System.out.println(sampleStr3+"맛있다");
//		}
//		
		
	}
}
