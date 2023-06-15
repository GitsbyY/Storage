
public class OddEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//홀짝 찾기 
//		출력 ex
//		1
//		1은 홀입니다
//
//		10
//		10은 짝입니다
		
		int b = 14;
		int i = 13;
		String resultStr = "";
		String resultStr1 = "";
		
		resultStr = (b%2 == 0) ? "짝 입니다." : "홀 입니다.";
		resultStr1 = (i%2 == 0) ? "짝 입니다." : "홀 입니다.";
		
		System.out.println(b);
		System.out.println(b + "은 " +resultStr);
		System.out.println();
		System.out.println(i);
		System.out.println(i + "은 " + resultStr1);
		
		//만약에 이렇게 코딩을 짜게 되면 다양한 경우의 수에서 그만큼 변수가 늘어나서 관리가 안 된다.
		
	}
		
	}


