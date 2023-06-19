package one.ezen;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student student = new Student(); 인터페이스는 구현되지 않은 것이기 때문에 만들 수 없다.
		
		EzenStudent es = new EzenStudent();
		
		int age = 10;
		// final 로 되어있기 때문에 의미가 없다.
		String name ="홍길동";
		
		es.setAge(age);
		es.name = name;
		
		es.info();
		
		
	}

}
