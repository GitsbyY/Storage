package four;

public class ExceptionThrowTestByCourse3 {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		}
		
		method2();
		
	}
	
	static void method1() {
		try {
			method2();
			System.out.println(1);
			}catch (ArithmeticException r) {
			System.out.println(2);
			}finally {
			System.out.println(3);
			}
		
		System.out.println(4); //오류를 지닌채로 진행한다.
		
	}
	
	static void method2() {
		throw new NullPointerException();
		}
	
}