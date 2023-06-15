package diceGame;

public class Dice {
	int dice;
	 
    int dice() {
    	
    	int random=(int)(Math.random()*6)+1; //1~6까지의 숫자 랜덤추출
    	dice = random;  //number변수에 랜덤값 저장
    	//System.out.println("주사위 번호:"+dice);
    	
 
        return dice;
    } // Random한 주사위 값을 반환하는 roll메소드
}
