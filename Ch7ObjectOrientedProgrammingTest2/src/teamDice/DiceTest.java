package teamDice;

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int diceNum = 0;
		
		Dice dice = new Dice();
		
		while (diceNum < 22) {
			
			count++;
			diceNum = dice.dice() + diceNum;
			
			if(diceNum >= 21) {
				System.out.println("횟수: " + count);
				break;
			}
			
		}
	
		System.out.println("주사위 총 합: " + diceNum);
		System.out.println("골에 도착했습니다");
		System.out.println("축하합니다");
		
	}

}
