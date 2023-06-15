package edu.constructorAndMethod.method.one;

public class HumanTest6 {
	// 증명해보자
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

		// 사람은 다양한 건물에 갈 수 있다
		// 집 말고 다른 곳에도 갈 수 있게 개발해봐.
		String buildingName = "";
		
		Human6 human = new Human6();
		human.name = "홍길동";
		human.age = 30;
		human.weight = 70.1;

		buildingName = "집";
		human.goBuilding(buildingName);

		human.myInfoView();

		Human6 human2 = new Human6();
		human2.name = "일지매";
		human2.age = 40;
		human2.weight = 80;

		buildingName = "기왓집";
		human2.goBuilding(buildingName);

		human2.myInfoView();

		Human6 human3 = new Human6();
		human3.name = "성춘향";
		human3.age = 28;
		human3.weight = 58;

		buildingName = "궁궐";
		human3.goBuilding(buildingName);

		human3.myInfoView();

		Human6 human4 = new Human6();
		human4.name = "임꺽정";
		human4.age = 45;
		human4.weight = 92.8;

		buildingName = "학원";
		human4.goBuilding(buildingName);

		human4.myInfoView();

		Human6 human5 = new Human6();
		human5.name = "콩쥐";
		human5.age = 26;
		human5.weight = 63;

		buildingName = "학교";
		human5.goBuilding(buildingName);

		human5.myInfoView();

	}

}