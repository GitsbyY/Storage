
public class Ch4_1ConditionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		학생의 점수가 60점 이상이면 합격을 판별하는 프로그램
//		
//		출력 ex
//		
//		60
//		합격입니다.
//		
//		or
//		
//		59
//		불합격입니다.
		
		 int num = 0;
		 
		 num = 70;
		 
		 if(num >= 60) {
			 
			 System.out.println(num);
			 System.out.println("합격입니다.");
		 }
		 
		 if(num < 60) {
		 System.out.println(num);	
		 System.out.println("불합격입니다.");
		 }
		 
	}

}
