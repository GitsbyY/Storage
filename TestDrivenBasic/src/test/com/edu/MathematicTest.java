package test.com.edu;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.edu.Mathematic;

public class MathematicTest {

//	@Test
//	public void testSum() {
//		fail("Not yet implemented");
//	}
	
	
	//리턴 타입이 일반적으로 단위 테스트가 된다.
	//이 메서드를 그대로 쓰는 대신에 타입은 무조건 void
	//메서드의 이름은 메서드 이름 앞에 test 를 붙인다.
//	public int sum(int a, int b) {
//		return 0;
//	}
	
	@Ignore
	public void testSum() {
		
		Mathematic m = new Mathematic();
		
		int a = 10;
		int b = 20;
		
		int result = m.sum(a, b);//예상응답
		
		assertEquals(30,result);
	
		assertEquals(0, m.sum(100, -100)); 
	}
	@Test
	public void checkNumArr() {
		
		int[] numArr = new int[5];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		
		Mathematic m = new Mathematic();
		
		int[] resultNumArr = m.checkNumArr(numArr);
		
		int[] expectedNumArr = new int[5];
		
		expectedNumArr[0] = 5;
		expectedNumArr[1] = 10;
		expectedNumArr[2] = 15;
		expectedNumArr[3] = 20;
		expectedNumArr[4] = 25;
		
		
		assertArrayEquals("그렇다", expectedNumArr ,resultNumArr);
		
		
		
	}
	
}
