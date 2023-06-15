package diceGame;

public class DiceGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Dice die = new Dice(); // 주사위 클래스 객체 생성
		  
	        int one = 0; // 주사위를 던진 값
	 
	        while (true) {
	            int two = die.dice(); // 그 다음 주사위를 던진 값
	            System.out.println(one + " // " + two);
	            one = two;
	            two = die.dice();
	            System.out.println(one + " // " + two);
	 
	            if (one == two) // 이전에 던진 주사위값과 새로 던진 주사위의 값이 같으면 종료
	                break;
	        }
	}

}
