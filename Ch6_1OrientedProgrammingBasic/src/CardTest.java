
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		System.out.println();
		
		Card c1 = new Card();
		c1.kind = "♥";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.kind = "♠";
		c2.num = 10;
		
		System.out.println("c1은 " + c1.kind + c1.num + "이며,"
				+ "크기는"+ c1.width + ", " + c1.height);
		System.out.println("c2은 " + c2.kind + c2.num + "이며,"
				+ "크기는"+ c2.width + ", " + c2.height);
		System.out.println();
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println();
		System.out.println("c1은 " + c1.kind + c1.num + "이며,"
				+ "크기는"+ c1.width + ", " + c1.height);
		System.out.println("c2은 " + c2.kind + c2.num + "이며,"
				+ "크기는"+ c2.width + ", " + c2.height);
		
		
	}

}
