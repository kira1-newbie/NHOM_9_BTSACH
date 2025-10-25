import java.util.Scanner;
public abstract class Book implements IGiaBan, IKiemKe{
	protected String bookID;
	protected String title, author;
	protected int quantity, publicationYear;
	protected double giaCoBan;
    Scanner sc = new Scanner(System.in);
	public Book(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.publicationYear = publicationYear;
		this.giaCoBan=giaCoBan;
	}
	public Book() {
	}
	public Double getgiaCoBan(){
		return giaCoBan;
	}
	public void setgiaCoBan(Double giaCoBan)
	{
		this.giaCoBan=giaCoBan;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	  public void Nhap() {
	        System.out.print("Nhap bookID: "); bookID= sc.nextLine();
	        System.out.print("Nhap title: ");  title= sc.nextLine();
	        System.out.print("Nhap author: "); author = sc.nextLine();
	        System.out.print("Nhap quantity: "); quantity = sc.nextInt();
	        System.out.print("Nhap publicationYear: "); publicationYear = sc.nextInt();
	        System.out.print("Nhap gia co ban: "); giaCoBan=sc.nextDouble();
			sc.nextLine();
	  }
	  @Override
	public String toString() {
		return "BookID: "+bookID+
				"\nTitle: "+title+
				"\nAuthor: "+author+
				"\nPublication Year: "+publicationYear+
				"\nQuantity: "+quantity+ "\nGia co ban: "+giaCoBan;
	}

}
