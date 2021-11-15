/* WAP for Book
   Book properties are : bookTitle, bookAuthor, bookPrice,bookPages.
   initialize all the properties using constructor.
   print all the properties using non-static method.
   create 3 Book object and display book details in main method*/

class Book
{
	public String bookTitle;
	public String bookAuthor;
	public double bookPrice;
	public int bookPages;

	Book(String q,String p,double a,int b)
	{
		bookTitle = q;
		bookAuthor = p;
		bookPrice = a;
		bookPages = b;
	}

	public void bookDetails()
	{
		System.out.println("*************************************");
		System.out.println("BookTitle : "+bookTitle);
		System.out.println("BookAuthor : "+bookAuthor);
		System.out.println("BookPrice : "+bookPrice);
		System.out.println("BookPages : "+bookPages);
	}

	public static void main(String[] args) 
	{
		Book b1 = new Book("java","Ashok",2250.26,250);
		Book b2 = new Book("sql","ganesh",450.23,150);
		Book b3 = new Book("html","Ravi",450.23,200);
		b1.bookDetails();
		b2.bookDetails();
		b3.bookDetails();
	}
}
