package one;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1~10까지의 숫자를 담을 수 있는 배열이 있다
	      
	      만약 배열의 값을 벗어나는 인덱스 값을 배열에서 접근했다면 발생할 수 있는
	      문제를 예외처리 하시오
	      
	     ex: 11번째 위치 접근시 오류가 발생했다면
	      그 값은 배열의 위치를 벗어났습니다 0~9사이만 접근이 가능하다 
	      식으로 문자열을 출력하시오
*/
		int[] excepArr = new int [9]; 
	        
		
		try {
				for (int i = 0; i < 15; i++) {
					excepArr[i] = i+1;
					System.out.println(excepArr[i]);
				}
	        }catch (Exception e) {
	           System.out.println("그 값은 배열의 위치를 벗어났습니다.");
	           System.out.println("0~9사이만 접근이 가능하다");
	        }
		
		System.out.println("=======================");
		
		for (int i = 0; i < 15; i++) {
		try {
				excepArr[i] = i+1;
				System.out.println(excepArr[i]);
        }catch (Exception e) {
           System.out.println("그 값은 배열의 위치를 벗어났습니다.");
           System.out.println("0~9사이만 접근이 가능하다");
        }
	    
	    
		for (int j = 0; j < 15; j++) {
			try {
					excepArr[j] = j+1;
					System.out.println(excepArr[j]);
	        }catch (ArrayIndexOutOfBoundsException e) {
	           System.out.println("그 값은 배열의 위치를 벗어났습니다.");
	           System.out.println("0~9사이만 접근이 가능하다");
	        }
		
			}
		//오류 메세지를 잘 읽어보자
		
		try {
			for (int j = 0; j < excepArr.length + 2; j++) {
				System.out.println(excepArr[j]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		}
	}
}

