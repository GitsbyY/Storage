package ezen.six;

import java.util.Scanner;

public class GudanMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단의 단을 입력하세요 : ");
		int input = scan.nextInt();
		for(int j = 1; j <10; j++) {
			System.out.println(input + " * " + j + " = " + input*j);
		}
	}

}
