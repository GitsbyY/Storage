package teamDice.two;

public class Dice {
	int dice;
	 
    int dice() {
    	
    	int random=(int)(Math.random()*6)+1; //1~6까지의 숫자 랜덤추출
    	dice = random;  //변수에 랜덤값 저장
    	//System.out.println("주사위 번호:"+dice);
        return dice;
    } // Random한 주사위 값을 반환하는 메소드
    
    void Test() {
    	int count = 0;
		int diceNum = 0;
		while (diceNum < 22) {
			
			count++;
			diceNum = dice() + diceNum;
			
			if(diceNum >= 21) {
				System.out.println("횟수: " + count);
				System.out.println("골에 도착했습니다");
				System.out.println("축하합니다");
				break;
			}
			System.out.println("횟수: " + count);
			System.out.println("주사위 총 합: " + diceNum);
			
			
			
		}
    }
    
    
}
