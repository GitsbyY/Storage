package ezen.nine.two;

public class ExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;
		Exam3 exam = new Exam3();
		exam.n=10;		
		exam.m=20;
		result = exam.add(exam);
		
		System.out.println(result);
		System.out.println(exam.n + "  " + exam.m);
	}

}
