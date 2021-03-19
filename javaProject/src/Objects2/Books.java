package Objects2;

public class Books {
	
	private String bookName;
	private String bookWriter;
	private String publisher;
	private int bookPrice;
	
	public Books(String bookName, String bookWriter, String publisher, int bookPrice) {
		
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.publisher = publisher;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}
	
}




