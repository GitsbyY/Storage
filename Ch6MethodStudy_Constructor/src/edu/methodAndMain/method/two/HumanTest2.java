package edu.methodAndMain.method.two;

public class HumanTest2 {
	//증명해보자
    // 메서드를 써야하는 이유
    // 프로그래밍을 할 때 주의할 점
    // 같은 코드를 반복하지 않는다
    // 한번 작성한 코드는 언제든 바뀔 수 있다는 것을 생각하자
	
   public static void main(String[] args) {
	 
	 System.out.println("매서드를 써야하는 이유");  
	 System.out.println("여러명이라면?");  
	 
	 Human2 human = new Human2();
	 human.name = "홍길동";
	 human.goHome();
     
	 Human2 human2 = new Human2();
	 human2.name = "일지매";
	 human2.goHome();
	 
	 Human2 human3 = new Human2();
	 human3.name = "성춘향";
	 human3.goHome();
	 
	 Human2 human4 = new Human2();
	 human4.name = "임꺽정";
	 human4.goHome();
	 
	 Human2 human5 = new Human2();
	 human5.name = "콩쥐";
	 human5.goHome();
   }

}