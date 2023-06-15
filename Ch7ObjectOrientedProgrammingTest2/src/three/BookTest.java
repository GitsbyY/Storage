package three;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book firstBook = new Book();
		
		firstBook.setBookName("재벌집 막내아들"); 
		firstBook.setAuthorName("산경");
		firstBook.setPublisherName("문피아");
		firstBook.setPrice(12_000);
		firstBook.setPublishedDate("22.02.04");
		
		System.out.println("책 이름 : " + firstBook.getBookName()); 
		System.out.println("작가 : " + firstBook.getAuthorName()); 
		System.out.println("출판사 : " + firstBook.getPublisherName()); 
		System.out.println("가격 : " + firstBook.getPrice()); 
		System.out.println("출판 날짜 : " + firstBook.getPublishedDate()); 
		System.out.println();
		System.out.println("==========");
		System.out.println();
				
		Book secondBook = new Book();
		
		secondBook.setBookName("해리포터와 마법사의 돌"); 
		secondBook.setAuthorName("J.K 롤린");
		secondBook.setPublisherName("문학수첩");
		secondBook.setPrice(8_100);
		secondBook.setPublishedDate("19.11.19");
		
		System.out.println("책 이름 : " + secondBook.getBookName()); 
		System.out.println("작가 : " + secondBook.getAuthorName()); 
		System.out.println("출판사 : " + secondBook.getPublisherName()); 
		System.out.println("가격 : " + secondBook.getPrice()); 
		System.out.println("출판 날짜 : " + secondBook.getPublishedDate()); 
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		Book threeBook = new Book();
		
		threeBook.setBookName("생각하라 그리고 부자가 되어라"); 
		threeBook.setAuthorName("나폴레온 힐");
		threeBook.setPublisherName("반니");
		threeBook.setPrice(11_700);
		threeBook.setPublishedDate("21.01.05");
		
		System.out.println("책 이름 : " + threeBook.getBookName()); 
		System.out.println("작가 : " + threeBook.getAuthorName()); 
		System.out.println("출판사 : " + threeBook.getPublisherName()); 
		System.out.println("가격 : " + threeBook.getPrice()); 
		System.out.println("출판 날짜 : " + threeBook.getPublishedDate()); 
		
	}

}
