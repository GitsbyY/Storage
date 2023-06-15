package ezen.three;
//BoolValueObject  --> 데이터들만 있는 객체. 브이오객체
public class Book {
	
	private String title = "";
	private String author = "";
	private String publisher = "";
	private int price = 0;
	private String publicationDate = "";
	
	public Book() {
		super();
	}

	public Book(String title, String author, String publisher
			, int price, String publicationDate) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.publicationDate = publicationDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author 
				+ ", publisher=" + publisher + ", price=" + price
				+ ", publicationDate=" + publicationDate + "]";
	}
	
	
	
}
