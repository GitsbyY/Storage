package edu.methodAndMain.method.one;

public class Gugudan2 {

	public void printGugudna() {
		String gugudanStr = "";

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				gugudanStr = i + " * " + j + " = " + (i * j) + "\t";

				System.out.print(gugudanStr);
			}
			System.out.println();
		}
	}

	// 원하는 단 하나만 출력
	void printGugudna(int danNum) {
		String gugudanStr = "";
		
		for (int i = 1; i <= 9; i++) {
			
				gugudanStr = danNum  + " * " + i + " = " + (i * danNum ) + "\t";

				System.out.print(gugudanStr);
		}
			System.out.println();
		}
	
	void printGugudna(int startNum, int endNum) {
	
	String gugudanStr = "";
    
    for (int i = startNum; i <= endNum; i++) {
         for (int j = 1; j <= 9; j++) {
            gugudanStr = i + " * " + j + " = " + (i * j) + "\t";
             
            System.out.print(gugudanStr);
         }
         System.out.println();	
	 }
	}
}
