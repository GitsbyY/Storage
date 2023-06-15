package ezen.six;

import java.util.Scanner;

public class GudanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		int input = sc.nextInt();
		Gugudan gu = new Gugudan();
		gu.makeGugudan(input);
		sc.close();
	}
	
}
