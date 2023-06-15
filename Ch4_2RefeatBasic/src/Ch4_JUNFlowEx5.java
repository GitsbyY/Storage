public class Ch4_JUNFlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		중첩 반복문
//		
		for (int i = 1; i <= 2; i++) {
			
			for (int n = 2; n <= 3; n++) {
				System.out.println("외부 for문 : " + i);
				System.out.println("내부 for문 : " + n);
				//System.out.print(n + " * " + i + " = " + (i * n) + "\t");	
			}//블럭이 끝이 나면 외부의 for로 가는 것이 아니라 밑으로 내려간다.
			 //내부 for문이 종료 되었다는 것은 n이라는 변수의 소멸을 의미한다.
			System.out.println("====내부 for문이 끝남====");
			System.out.println("외부 for문 : " + i);
			//System.out.println("내부 for문 : " + n);//반복문에서 종료가 되었기에 n이 존재하지 않는다.
			System.out.println();
			
		}
	}
}
