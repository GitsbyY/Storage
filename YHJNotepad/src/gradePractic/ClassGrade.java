package gradePractic;

import java.util.Scanner;

public class ClassGrade {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int studentNum = 0; //입력받을 학생 수
		
		Scanner scanner = new Scanner(System.in); //학생정보 스캐너
		Scanner sc = new Scanner(System.in);      //학생수 스캐너
		
		System.out.println("학생 수를 입력해주세요");
		studentNum = sc.nextInt();
		
		System.out.println("이름 수학 영어 국어 순으로 (홍길동 100 100 100)과 같이 입력하시오");
		Student [] student = new Student[studentNum]; //학생수만큼 Student 객체 생성
		
		//이름, 성적을 Scanner로 입력받는다.
		for(int i=0;i<student.length;i++){
			String name = scanner.next();
			int math = scanner.nextInt();
			int english = scanner.nextInt();
			int korean = scanner.nextInt();
			
			student[i] = new Student(name,math,english,korean); //student에 값 넘겨주기
		}
		
		System.out.println("##성적표##");
		System.out.println();
		System.out.println("이름"+"\t"+"수학"+"\t"+"영어"+"\t"+"국어"+"\t"+"총점"+"\t"+"평균");
		System.out.println();
		
		for(int i=0;i<student.length;i++)
		{	
			System.out.print(student[i].name +"\t"+student[i].math +"\t"+student[i].english +"\t"+student[i].korean+"\t");
			System.out.print(student[i].Sum()+"\t");
			System.out.println(student[i].Average());
		
		}
		System.out.println();
	
		scanner.close();
		sc.close();
	}//end of main
}
