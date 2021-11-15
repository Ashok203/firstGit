class Book 
{
	public String bookTitle;
	public String bookAuthor;
	public int bookPrice;
	public int bookPages;

	Book(String bookTitle,String bookAuthor,int bookPrice,int bookPages)
	{
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPages = bookPages;
	}
	public void bookDetails()
	{
		System.out.println("----------------------------------");
		System.out.println("Booktitle is : "+bookTitle);
		System.out.println("BookAuthor is : "+bookAuthor);
		System.out.println("BookPrice is : "+bookPrice);
		System.out.println("BookPages is : "+bookPages);
	}
	public static void main(String[] args) 
	{
		Book b1 = new Book("JAVA","ASHOK",252,150);
		Book b2 = new Book("SQL","RAVI",350,200);
		b1.bookDetails();
		b2.bookDetails();
	}
}
