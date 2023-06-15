package chap6Final;

public class Student2 {

	
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	//int total = 0;
	//double avg = 0;
	

	Student2(String name, int ban, int no) {
		System.out.println("이름 : " + name + "/ 반 : " + ban + "/ 번호 : " + no);
	}

	
	void studentScore() {
		
		System.out.println("국어 : " + kor + " / 영어 : " + eng + " / 수학 :" + math);
	}

	int getTotal() {
		int total = kor + eng + math;
		System.out.println("총점 : " + total);
		return total;
		
	}

	double getAverage() {
		double avg = ((int)(((kor+eng+math) / 3.0 + 0.005)*100) / 100.0);
		
		System.out.println("평균 : " + avg);
		return avg;
	}
	
	void getResult() {
		int total = kor + eng + math;
		System.out.println("총점 : " + total);
		double avg = ((int)(((kor+eng+math) / 3.0 + 0.005)*100) / 100.0);
		System.out.println("평균 : " + avg);
	}
}
