package ezen.three;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book firstBook = new Book();
		
		firstBook.setTitle("재벌집 막내아들"); 
		firstBook.setAuthor("산경");
		firstBook.setPublisher("문피아");
		firstBook.setPrice(12_000);
		firstBook.setPublicationDate("22.02.04");
		
		System.out.println(firstBook.toString());
		
//		System.out.println("책 이름 : " + firstBook.getTitle()); 
//		System.out.println("작가 : " + firstBook.getAuthor()); 
//		System.out.println("출판사 : " + firstBook.getPublisher()); 
//		System.out.println("가격 : " + firstBook.getPrice()); 
//		System.out.println("출판 날짜 : " + firstBook.getPublicationDate()); 
//		System.out.println();
//		System.out.println("==========");
//		System.out.println();
				
		Book secondBook = new Book();
		
		secondBook.setTitle("해리포터와 마법사의 돌"); 
		secondBook.setAuthor("J.K 롤린");
		secondBook.setPublisher("문학수첩");
		secondBook.setPrice(8_100);
		secondBook.setPublicationDate("19.11.19");
		
		System.out.println(secondBook.toString());
		
//		System.out.println("책 이름 : " + secondBook.getTitle()); 
//		System.out.println("작가 : " + secondBook.getAuthor()); 
//		System.out.println("출판사 : " + secondBook.getPublisher()); 
//		System.out.println("가격 : " + secondBook.getPrice()); 
//		System.out.println("출판 날짜 : " + secondBook.getPublicationDate()); 
//		System.out.println();
//		System.out.println("==========");
//		System.out.println();
		
		Book threeBook = new Book();
		
		threeBook.setTitle("생각하라 그리고 부자가 되어라"); 
		threeBook.setAuthor("나폴레온 힐");
		threeBook.setPublisher("반니");
		threeBook.setPrice(11_700);
		threeBook.setPublicationDate("21.01.05");
		
		System.out.println(threeBook.toString());
//		System.out.println("책 이름 : " + threeBook.getTitle()); 
//		System.out.println("작가 : " + threeBook.getAuthor()); 
//		System.out.println("출판사 : " + threeBook.getPublisher()); 
//		System.out.println("가격 : " + threeBook.getPrice()); 
//		System.out.println("출판 날짜 : " + threeBook.getPublicationDate()); 
		
	}

}
