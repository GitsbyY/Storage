package supertest3;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지역 변수? 인스턴스 변수? 부모 인스턴스변ㅅ?
		
		Point3D p3d = new Point3D();
//		디버깅?(Debugging)
		System.out.println("메인 위치");
		System.out.println(p3d);
		
		
//		String result = "";
//		result = p3d.getLocation();
//		System.out.println(result);
		
		// 왜? 주소는 하나죠? new를 할 때 주소가 한 번 생성 되기에 하나만 출력 된다.
		
		//왜 메인 메서드에서 x값을 호출하면
		//항상 자식에 있는 값만 출력이 될까?
		
		System.out.println(p3d.x);
//    	System.out.println(p3d.super.x);
	}

}
