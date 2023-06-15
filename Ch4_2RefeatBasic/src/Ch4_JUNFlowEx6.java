public class Ch4_JUNFlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		중첩 반복문
//		
//		2 * 1 = 2 		3 * 1 = 3
//		,				,
//		,				,
//		,				,	
//		,				,
//		2 * 9 = 18		3 * 9 = 27
		
		for (int i = 1; i <= 9; i++) {
			
			for (int n = 2; n <= 9; n++) {
				
				System.out.print(n + " * " + i + " = " + (i * n) + "\t");	
			}
	
			System.out.println();
			
		}
	}
}
