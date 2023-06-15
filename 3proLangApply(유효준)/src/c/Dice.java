package c;

import java.util.Scanner;

public class Dice {
	public int diceFace;
	public int user;

	public int rollDice()	{
		return (int)(Math.random() * 6) + 1; 
	}
	
	public int getUserInput() {
		System.out.println("=== 주사위 맞추기 ===");
		System.out.println("주사위 숫자는 무엇일까요?");
		System.out.println("기회는 한 번뿐이니 신중히 입력해주세요!!");
		System.out.println();
		System.out.print("숫자를 입력해주세요 (1~6)>>  \t");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void checkUserGuess() {
		if( diceFace == user) {
			System.out.println("주사위 숫자  :유저의 숫자");
			System.out.println(diceFace + "\t :" + user);
			System.out.println("정답입니다.");
		} else {
			System.out.println("주사위 숫자  :유저의 숫자");
			System.out.println(diceFace + "\t :" + user);
			System.out.println("틀렸습니다.");
		}
	}
	public void startPlaying() {	
		user = getUserInput();
		diceFace = rollDice();
		checkUserGuess();
	}
}
