
public class CardTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CardCaseVer2 cardCase = new CardCaseVer2();
		cardCase.cardCaseInSide();
		
		cardCase.shuffle();
		System.out.println();
		
		cardCase.cardCaseInSide();
		
		Card cv = null;
		
		cv = cardCase.pick(53);
		System.out.println(cv.getCard());
		
		
	}

}
