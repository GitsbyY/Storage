
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String choiceCardStr = "";
		
		Card card = new Card();
		
		
		choiceCardStr = card.getCard();
		
		System.out.println(choiceCardStr);
		
		CardCase cardCase = new CardCase();
		Card otherCard = null;
		
		//String choiceCardCaseOfCardStr = "";
		
		otherCard = cardCase.pick();
		
		choiceCardStr = otherCard.getCard();
		
		System.out.println(choiceCardStr);
		*/
		CardVer2 card = new CardVer2();
		
		CardCase cardCase = new CardCase();
		
		cardCase.shuffle();
		System.out.println();
		//cardCase.cardCaseInside();
	}

	
}
