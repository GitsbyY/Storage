
public class Ch3EtcEx1 {

	public static void main(String[] args) {
		
		double dNum = 3.141592;
		
		System.out.println(dNum);
		
		
//		소수점에서 3자리만 출력하라
//		or	
//		소수점에서 4번째 자리를 버림처리하고 출력하시오
		
		// 강제적으로 만들어줘야 한다. 
		
		double changeDoubleNum = 0.0;
		
		changeDoubleNum = (int)(dNum * 1000) / 1000.0;
		//우선순위가 중요하다. 2번실행	1번으로 실행		.0이니까 마지막 실행
		System.out.println(changeDoubleNum);
		
		
	}

}
