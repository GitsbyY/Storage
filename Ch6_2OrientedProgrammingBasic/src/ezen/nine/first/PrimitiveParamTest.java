package ezen.nine.first;

public class PrimitiveParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;
		PrimitiveParamEx ppe = new PrimitiveParamEx();
		int[] cArr = new int[1];
		int[] dArr = new int[1];
		cArr[0] = 10;
		dArr[0] = 20;
		

		result = ppe.change(cArr,dArr);
		System.out.println(result);
		System.out.println(cArr[0] + "  " + dArr[0]);
	}

}
