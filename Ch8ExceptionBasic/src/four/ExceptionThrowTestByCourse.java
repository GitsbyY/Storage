package four;

public class ExceptionThrowTestByCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(true);
		method(false);
		
	}
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) {
				throw new ArithmeticException();
			}
			System.out.println(2);
		  	}catch (ArithmeticException r) {
				System.out.println(3);
			}catch (Exception e) {
			System.out.println(4);
			}finally {
			System.out.println(5);
			}
		System.out.println(6);
}
}