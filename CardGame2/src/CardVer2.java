
public class CardVer2 extends Card{
	
	 static String[] specialCardColorArr = {"W_","Y_"};
	   static String[] specialCardShapeArr = {"Joker"};
	   
	   
	   CardVer2(){
	      init();
	   }
	   
	   CardVer2(int colorIndex, int shapeIndex){
	      init(colorIndex, shapeIndex);
	   }
	   
	// 임의의 카드 생성 오버라이딩   
	   void init() {
	      int probability = 0;
	      int colorIndex = 0;
	      int shapeIndex = 0;
	      
	      // 54개
	      probability = Card.shapeArr.length * Card.numberArr.length +2;
	      
	      probability = (int)(probability * Math.random()) +1;
	      
	      if(probability > 52) {
	         colorIndex = (int)(Math.random()* specialCardColorArr.length);
	         shapeIndex = (int)(Math.random()* specialCardShapeArr.length);
	         card = specialCardColorArr[colorIndex]
	               + specialCardShapeArr[shapeIndex];
	      }else {//조커들이 아니면 일반카드 생성
	         super.init();
	      }
	      
	   }
	   // 수동으로 카드생성
	   void init(int colorIndex, int shapeIndex) {
	      card = specialCardColorArr[colorIndex]
	            + specialCardShapeArr[shapeIndex];
	   }
	   
	//카드를 확인할 수 있는 곳
	//   String getCard() {
//	      return card;
	//   }

	
	
}
