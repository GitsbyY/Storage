
public class CardCase {
	
	int numOfCards = CardVer2.shapeArr.length * CardVer2.numberArr.length;
	CardVer2[] cardArr = new CardVer2[numOfCards];
	
	CardCase() {
		int totalCount = 0;
		
		for (int i = 0; i < CardVer2.shapeArr.length; i++) {
			for (int j = 0; j < CardVer2.numberArr.length; j++) {
				cardArr[totalCount] = new CardVer2(i,j);
				totalCount++;
			}
		}//for end
	}
	CardVer2 pick(int index) {
		return cardArr[index];
	}
	
	CardVer2 pick() {
		int index = 0;
		index = (int)(Math.random() * numOfCards);
		
		return pick(index);
	}
	
	void shuffle() {
		int rand = 0;
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random() * numOfCards);
			
			CardVer2 tempCard = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = tempCard;
		}
	}
	//카드케이스의 카드보기
	/*
	void cardCaseInside() {
		Card otherCard = null;
		for (int i = 0; i < otherCard.; i++) {
			System.out.println(otherCard.cardArr[i].getCard());
		}
		
	}
	*/
	
}
