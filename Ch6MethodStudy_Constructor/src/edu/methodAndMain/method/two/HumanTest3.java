package edu.methodAndMain.method.two;

public class HumanTest3 {
	//증명해보자
    // 메서드를 써야하는 이유
    // 프로그래밍을 할 때 주의할 점
    // 같은 코드를 반복하지 않는다
    // 한번 작성한 코드는 언제든 바뀔 수 있다는 것을 생각하자
	
   public static void main(String[] args) {
	 
	 System.out.println("매서드를 써야하는 이유");  
	 System.out.println("여러명이라면?");  
	 
	 System.out.println("사람의 속성이 추가 된다면?");
	 System.out.println("하나가 변경되면 중요한 로직들이 전부 변하는 힘");
	 System.out.println("이것이 매서드를 사용하는 이유 중 하나이다.");
	 System.out.println("유지 보수 개발에 진가가 발휘됨");
	 System.out.println();
	 
	 Human3 human = new Human3();
	 human.name = "홍길동";
	 human.age = 30;
     human.weight = 70.1;
	 human.goHome();
     
	 Human3 human2 = new Human3();
	 human2.name = "일지매";
	 human2.age = 40;
	 human2.weight = 80;
	 human2.goHome();
	 
	 Human3 human3 = new Human3();
	 human3.name = "성춘향";
	 human3.age = 28;
	 human3.weight = 58;
	 human3.goHome();
	 
	 Human3 human4 = new Human3();
	 human4.name = "임꺽정";
	 human4.age = 45;
	 human4.weight = 92.8;
	 human4.goHome();
	 
	 Human3 human5 = new Human3();
	 human5.name = "콩쥐";
	 human5.age = 26;
	 human5.weight = 63;
	 human5.goHome();
   }

}