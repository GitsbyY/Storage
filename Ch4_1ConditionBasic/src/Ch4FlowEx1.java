
public class Ch4FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
/*		
		if-else if문
		
		처리해야 할 경우의 수가 2개 이상인 경우에 사용한다.
		
		if(조건식1) {
			조건식1의 연산결과가 참일 때 수행 될 문장들
		}else if(조건식2) {
			조건식2의 연산결과가 참일 때 수행 될 문장들
		}else if(조건식3) {
			조건식3의 연산결과가 참일 때 수행 될 문장들
		}else if(조건식4) {
			조건식4의 연산결과가 참일 때 수행 될 문장들
		}....
		
*/		
		
		int age = 0;
		
		age = 33;
		
		if(age >= 10 && age <= 20) {
			System.out.println("10대 입니다.");
		}else if(age >= 20 && age <= 30) {
			System.out.println("20대 입니다.");
		}else if(age >= 30 && age <= 40) {
			System.out.println("30대 입니다.");
		}
		
		System.out.println("프로그램이 종료됩니다.");
		
	}

}
