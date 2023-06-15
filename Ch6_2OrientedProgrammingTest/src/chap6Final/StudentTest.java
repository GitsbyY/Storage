package chap6Final;

//import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Student stu1 = new Student("홍길동", 2, 1);
		
		stu1.kor = 100; 
		stu1.eng = 60;
		stu1.math = 76;
		
		stu1.studentScore();
		stu1.getTotal();
		stu1.getAverage();
		
		Student stu = new Student("임찬우", 3, 1);
		stu.kor = 100; 
		stu.eng = 76;
		stu.math = 99;
		
		stu.studentScore();
		stu.getTotal();
		stu.getAverage();
	}

}
