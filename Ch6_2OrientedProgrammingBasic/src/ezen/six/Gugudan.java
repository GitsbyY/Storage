package ezen.six;

public class Gugudan {
	
	public void makeGugudan(int dan){
		System.out.println("====" + dan + "단" + "====");
		for(int i=1; i<=9; i++){
			System.out.println(dan+" X "+i+" = "+(dan*i));
		}
	}
}
