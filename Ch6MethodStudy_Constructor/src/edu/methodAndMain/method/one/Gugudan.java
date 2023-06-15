package edu.methodAndMain.method.one;

public class Gugudan {
	
	public void printGugudna(){
		String gugudanStr = "";
	       
	       for (int i = 2; i <= 9; i++) {
	            for (int j = 1; j <= 9; j++) {
	               gugudanStr = i + " * " + j + " = " + (i * j) + "\t";
	                
	               System.out.print(gugudanStr);
	            }
	            System.out.println();
		}
	}
	
}
