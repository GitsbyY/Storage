package edu.methodAndMain.normal.one;

public class Gugudan {
	
	public static void main(String[] args) {
		String gugudanStr = "";
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				gugudanStr = i + "*" + j + "=" + (i*j) + "\t";
				System.out.print(gugudanStr);
			}
			System.out.println();
		}
	}
	
}
