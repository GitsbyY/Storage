package ezen.eight;

public class PrimitiveParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimitiveParamEx ppe = new PrimitiveParamEx();
		int num = 10;
		
		System.out.println("change() 전 num : " + num);
		ppe.change(num);
		System.out.println("change() 끝나고 후 num : " + num);
		
	}

}
