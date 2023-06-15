
public class Card {
	
	static String[] shapeArr = {"♥", "◆", "♠", "♣"};
	static String[] numberArr = {"A","2","3","4","5"
			,"6","7","8","9","10","J","Q","K"		
	};
	
	String card = "";
	
	Card(int shapeIndex, int numberIndex){
		init(shapeIndex, numberIndex);
	}
	
	Card(){
		init();
	}
	
	
	//수동으로 카드 생성
	void init(int shapeIndex,int numberIndex) {
	card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	
	void init() {
		// 모양 랜덤 선택
		//int shapeIndex = (int)(Math.random()*shapArr.length);
		// 숫자 랜덤 선택
		//int numberIndex = (int)(Math.random()*numberArr.length);
		
		//card = shapArr[shapeIndex] + numberArr[numberIndex];
	}
	
	String getCard() {
		return card;
	}
	
	
}
