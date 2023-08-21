package test.ezen.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ezen.edu.Calc;


public class CalcTest {

	//곱하기 기능 구현
//	@Test
//	public void testMul() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testMul() {
		
		Calc c = new Calc();
		
		int a = 10;
		int b = 20;
		
		int result = c.mul(a, b);//예상응답
		
		assertEquals(200,result);
	
		assertEquals(-10000, c.mul(100, -100)); 
		
	}
	
}
