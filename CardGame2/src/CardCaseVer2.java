
public class CardCaseVer2 extends CardCase{
	
	 CardCaseVer2() {
	      numOfCards = (Card.shapeArr.length * Card.numberArr.length)
	            +(CardVer2.specialCardShapeArr.length
	                  * CardVer2.specialCardColorArr.length);
	      
//	      cardArr = new Card[numOfCards];
//	      init();
	   }
	   
	   void init() {
	      int totalCnt = 0; //52장의 카드를 위한 배열 인덱스
	      
	      for (int i = 0; i < Card.shapeArr.length; i++) {
	         for (int n = 0; n < Card.numberArr.length; n++) {
	            //cardArr[totalCnt] = new Card(i,n);
	            totalCnt++;
	         }
	      }
//	      조커 카드 등록
	      for (int i = 0; i < CardVer2.specialCardColorArr.length; i++) {
	         for (int n = 0; n < CardVer2.specialCardShapeArr.length; n++) {
	            cardArr[totalCnt] = new CardVer2(i,n);
	            totalCnt++;
	         }
	      }
	   }
	   
	   public void cardCasePrint() {
	      for (int i = 0; i < cardArr.length-1; i++) {
	         System.out.println();
	         
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
