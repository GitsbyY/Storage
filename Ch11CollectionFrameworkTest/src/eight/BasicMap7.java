package eight;

import java.util.HashMap;
import java.util.Scanner;

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
		
		Scanner scan = new Scanner(System.in);

		HashMap<String, Employee> empMap = new HashMap<String, Employee>();

		Employee employee = new Employee("0", "이사장", 5000);
		
		System.out.println("현재 재직자 목록");
		
		empMap.put(employee.getEmpNo(), employee);

//      음 일단 완벽하구만
//      System.out.println("0");

		 
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
			empMap.get(inputEmpNo).EmployInfo();
//			empMap.remove(inputEmpNo);
			System.out.println("사원이 퇴사처리 되었습니다.");
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		System.out.println("갱신 된 재직자 목록");
		
//      전체 사원 파악
		for (int i = 0; i < empMap.size(); i++) {
			System.out.println(empMap.get(i + ""));
		}
		
		String passEmpNo = "";
		String passEname = "";
		
		int passSal = 0;
		int choice = 0;
		
		System.out.println("1. 종료한다 \t 2.새로운 사원을 입력한다.");
		
		choice = scan.nextInt();
		
		if(choice == 2) {
			
			System.out.println("새로 입사한 사원의 번호를 입력 해 주세요.");
			passEmpNo = scan.next();
			System.out.println("새로 입사한 사원의 이름을 입력 해 주세요.");
			passEname = scan.next();
			System.out.println("새로 입사한 사원의 급여를 입력 해 주세요. (숫자만 기입!)");
			passSal = scan.nextInt();
			employee = new Employee(passEmpNo, passEname, passSal);
			
			empMap.put(employee.getEmpNo(), employee);
			
			//사원번호를 마음대로 할 수 없을까?
			System.out.println("갱신 된 목록을 출력합니다. 확인하고 종료하시면 됩니다.");
			for (int i = 0; i < empMap.size(); i++) {
				System.out.println(empMap.get(i + ""));
			}
		}else {
			System.out.println("프로그램 종료합니다.");
		}
		
		
		
		
		System.out.println("프로그램 종료합니다.");

	}

}