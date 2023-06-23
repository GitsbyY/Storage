package eight.icw;

import java.util.HashMap;
import java.util.Scanner;

public class BasicMap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		사원의 정보에는
//		사원번호
//		사원명
//		급여
//		정보가 있다.
//		
//		사원의 정보를 찾아서 지우는 프로그램을 만드시오
		
//		ver2
//		사원을 찾았습니다
//		사원이 퇴사처리 되었습니다?????
//		사원의 정보를 지우는데 누가 지워졌는지 확인하기 어렵다.
//		사원번호와 사원명을 표시하시오
		
//		새로운 사원이 입사했다.
//		입사한 사원의 정보를 입력하는 로직을 구현하시오
//		새 사원은 블라디미르 사원인데 번호는 순차적으로 부여하고 급여는 2000원으로 적용하시오
		
//		새로 입사했다는 표현을 통해 표현하고
//		오든 사원의 정보를 toString으로 보여주시오
		
		HashMap<String, Employee> empMap 
			= new HashMap<String, Employee>();
		
		Employee employee = new Employee("0", "이사장", 5000);
		empMap.put(employee.getEmpNo(), employee);
		
//		음 일단 완벽하구만
//		System.out.println(empMap.get("0"));
		for (int i = 0; i < 3; i++) {
			employee = new Employee((i+1) + "", "사원"
					+ (i+1), (i+1)*500);
			empMap.put(employee.getEmpNo(), employee);
		}
//		전체 사원 파악
		for (int i = 0; i < empMap.size(); i++) {
			System.out.println(empMap.get(i + ""));
		}
		
		System.out.println();
		
		String inputEmpNo = "";
		inputEmpNo = "1";
		//사원 퇴사처리 로직
		Employee choiceEmp = empMap.get(inputEmpNo); 
		if (choiceEmp != null) {
			System.out.println("사원을 찾았습니다.");
			System.out.println("[퇴사처리 할 사원의 정보 출력]");
			
			System.out.println(empMap.get(inputEmpNo));
			empMap.remove(inputEmpNo);
			System.out.println();
			System.out.println("사원이 퇴사처리 되었습니다.");
		}
		
//		전체 사원 파악
		for (int i = 0; i < 4; i++) {
			System.out.println(empMap.get(i + ""));
		}
		System.out.println();
		
		System.out.println("새로운 사원의 정보 추가");
		String addEmpno = "";
		String inputName = "";
		int inputSal = 0;
		
		Scanner scan = new Scanner(System.in);
		
		String stopStr = "";
		while (true) {
			addEmpno =  String.valueOf(empMap.size()+1);
			System.out.println("신규 사원의 이름을 입력하세요");
			System.out.print("사원명 : ");
			inputName = scan.nextLine();
			System.out.println();
			System.out.println("신규 사원의 연봉을 입력하세요");
			System.out.print("연봉 : ");
			inputSal = scan.nextInt();
			scan.nextLine();
			System.out.println();
			empMap.put(addEmpno, new Employee(addEmpno, inputName, inputSal));
			
//			전체 사원 파악
			for (int i = 0; i <= empMap.size(); i++) {
				System.out.println(empMap.get(i + ""));
			}
			System.out.println();
			
			System.out.println(empMap.toString());
			
			System.out.println("종료 하시겠습니다?");
			System.out.println("종료하시려면 \"종료\"를 입력해주세요");
			stopStr = scan.nextLine();
			if (stopStr.equals("종료")) {
				break;
			}
		} // while문 종료
		
		
		
		System.out.println("프로그램을 종료합니다.");
//		scan.close();
	}

}
