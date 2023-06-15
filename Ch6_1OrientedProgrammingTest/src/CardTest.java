
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이젠 교육
		//내맘대로
		//나머지 값 자유
		
		Card c1 = new Card();
		c1.kind = "☆이젠교육☆";
		c1.num = 99;
		c1.width = 20;
		c1.height = 40;
		c1.cardName = "이젠아카데미 교육용";
		
		Card c2 = new Card();
		c2.kind = "♠◆♥♣";
		c2.num = 10;
		c2.width = 5;
		c2.height = 15;
		c2.cardName = "즐거운 카드놀이";
		
		System.out.print(c1.width +",  "+ c1.height +",  "+ c1.kind +" " +c1.num);
		System.out.println();
		System.out.println(c1.cardName);
		System.out.println(Card.company);
		System.out.println();
		System.out.print(c2.width +",  "+ c2.height +",  "+ c2.kind+ " " + c2.num);
		System.out.println();
		System.out.println(c2.cardName);
		System.out.println(Card.company);
	}

}
