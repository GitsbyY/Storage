
public class CardCase {

	int numOfCards = Card.shapeArr.length * Card.numberArr.length;
	Card[] cardArr = new Card[numOfCards];
	
	
	CardCase() {
		int totalCount = 0;
		
		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
//				카드를 하나씩 만드는 곳
				cardArr[totalCount] = new Card(i, n);
				totalCount++;
			}
		}// 전체 for end
		
	}
	
//	수동으로 카드 선택
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick() {
		int index = 0;
		index = (int)(Math.random() * numOfCards);
		
		return pick(index);
	}
	
	void shuffle() {
		int rand = 0;
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random() * numOfCards);
			
			Card tempCard = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = tempCard;
			
		}
	}
	
	// 카드케이스의 카드 보기
	void cardCaseInSide() {
		Card otherCard = null;
		String choiceCardStr = "";
		
		for (int i = 0; i < numOfCards; i++) {
			
			otherCard = cardArr[i];
			
			choiceCardStr = otherCard.getCard();
			
			System.out.print(choiceCardStr + " ");
		}
	}
}
