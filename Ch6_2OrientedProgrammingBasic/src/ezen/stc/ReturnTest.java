package ezen.stc;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnBasic rb = new ReturnBasic();
		
		int n = 10;
		int m = 20;
		int sum = 0;
		
		sum = rb.sumPrint(n, m);//sum = 108;이라고 되는 순간이있다.
		
		System.out.println(sum);
		
	}

}
