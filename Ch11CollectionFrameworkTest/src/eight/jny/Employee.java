package eight.jny;


//사원의 정보에는
//사원번호
//사원명
//급여
//라는 정보가 있다.
public class Employee {

	private String empNo = "";
	private String empName = "";
	private int sal = 0;
	
	public Employee() {
		super();
	}
	
	public Employee(String empNo, String empName, int sal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + "]" + "\n";
	}
	
}
