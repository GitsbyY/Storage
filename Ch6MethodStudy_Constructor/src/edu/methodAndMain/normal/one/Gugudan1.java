package edu.methodAndMain.normal.one;

public class Gugudan1 {
	
	public static void main(String[] args) {
		String gugudanStr = "";
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				gugudanStr = i + "*" + j + "=" + (i*j) + "\t";
				System.out.print(gugudanStr);
			}
			System.out.println();
		
		}//구구단 end
		System.out.println();
		int danNum = 3;
		for (int i = 1; i <= 9; i++) {
			gugudanStr = danNum + "*" + i + "=" + (danNum*i) + "\t";
			System.out.print(gugudanStr);
		}
		System.out.println();
		System.out.println();
		
		int startdanNum = 4;
		int enddanNum = 6;
		for (int i = startdanNum; startdanNum <= enddanNum; startdanNum++) {
			for (int j = 1; j < 10; j++) {
				gugudanStr = startdanNum + "*" + j + "=" + (startdanNum*j) + "\t";
				System.out.print(gugudanStr);
			}
			System.out.println();			
		}
		System.out.println();
	}
	
}
