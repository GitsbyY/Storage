
public class Ch4FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
	else 문
	
	조건식이 전부 아닌 경우 수행
	if(조건식1) {
		조건식1의 연산결과가 참일 때 수행 될 문장들
	}else if(조건식2) {
		조건식2의 연산결과가 참일 때 수행 될 문장들
	}else if(조건식3) {
		조건식3의 연산결과가 참일 때 수행 될 문장들
	}else if(조건식4) {
		조건식4의 연산결과가 참일 때 수행 될 문장들
	}else {
		위의 조건식이 전부 아닐 경우 수행 될 문장들을 적는다.
	}
	
*/		
		
		int age = 0;
		
		age = 39;
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		}else if(age >= 10 && age <= 19) {
			System.out.println("아동입니다.");
		}else {
			System.out.println("아동입니다.");
		}
		
		System.out.println("프로그램이 종료됩니다.");
		
	}

}
