package ezen.one;

public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		
		Child c = new Child();
		
		p.age = 10;
		//p.play(); 자식은 부모의 것을 받을 수 있지만, 부모는 자식의 것을 받을 수 없다.
		System.out.println(p.age);
		
		c.age = 100;
		c.play();
		System.out.println(p.age + c.age);
		
		
	}

}
