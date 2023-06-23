package tentwo;

import java.util.HashMap;

public class BasicMap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      사원의 정보에는
//      사원번호
//      사원명
//      급여
//      라는 정보가 있다.

//      사원의 정보를 찾아서 지우는 프로그램을 만드시오.
		
		
		
//		ver2
//		1)사원의 정보를 지우는데 누가 지워졌는지 확인하기 어렵다
//		사원 번호와 사원명을 표시하시오
//		2)새로운 사원이 입사했다
//		입사한 사원의 정보를 입력하는 로직을 구현하시오
		

		HashMap<String, Employee> empMap = new HashMap<String, Employee>();

		Employee employee = new Employee("0", "이사장", 5000);

		empMap.put(employee.getEmpNo(), employee);

//      음 일단 완벽하구만
//      System.out.println("0");

		// 전체 사원 파악
		for (int i = 0; i < 4; i++) {
			employee = new Employee((i + 1) + "", "사원" + (i + 1), (i + 1) * 500);
			empMap.put(employee.getEmpNo(), employee);
		}

		for (int i = 0; i < empMap.size(); i++) {
			System.out.println(empMap.get(i + ""));
		}

		String inputEmpNo = "";
		inputEmpNo = "1";

		Employee choiceEmp = empMap.get(inputEmpNo);

		if (choiceEmp != null) {
			System.out.println("사원을 찾았습니다");
			empMap.remove(inputEmpNo);
			
			System.out.println("사원이 퇴사처리 되었습니다.");
		}

//      전체 사원 파악
		for (int i = 0; i < empMap.size(); i++) {
			System.out.println(empMap.get(i + ""));
		}

		System.out.println("프로그램 종료합니다.");

	}

}