package ezen.five;

public class OverridingTest {
   /*
    
    오버라이딩(Overriding)이란?
    
    부모 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
    상송받은 메서드를 그대로 사용하기도 하지만,
    자식 클래스 자신에 맞게 변경해야하는 경우가 많다
    이럴 때 부모의 메서드를 오버라이딩 한다.
    
    오버라이딩 조건
    자식 클래스에서 오버라이딩하는 메서드는 부모 클래스의 메서드와
    - 이름이 같아야 한다.
    - 매개변수가 같아야 한다.
    - 반환타입이 같아야 한다.
    
    조심할거
    인스턴스 메서드를 static메서드로 또는 그 반대로 변경 할 수 없다
    
    오버로딩 vs 오버라이딩
    오버로딩은 기존에 없는 새로운 메서드를 추가하는 것(new)
    오버라이딩은 부모로부터 상속받은 메서드의 내용을 변경하는 것(change, modify)
        
    */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point();
		String reusltStr = "";
		
		reusltStr = p.getLocation();
		System.out.println(reusltStr);
		
		Point3D p3d = new Point3D();
		
		reusltStr = p3d.getLocation();
		System.out.println(reusltStr);
		
	}

}
