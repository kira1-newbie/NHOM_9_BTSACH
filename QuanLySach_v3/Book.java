import java.util.Scanner;

public abstract class Book {
	private String bookID;
	private String title, author;
	private int quantity, publicationYear;
	private double giaCoBan;
	Scanner sc = new Scanner(System.in);

	public Book(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan,
			Scanner sc) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.publicationYear = publicationYear;
		this.giaCoBan = giaCoBan;
		this.sc = sc;
	}

	public Book() {
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

	public double getGiaCoBan() {
		return giaCoBan;
	}

	public void setGiaCoBan(double giaCoBan) {
		this.giaCoBan = giaCoBan;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void Nhap() {
		System.out.print("Nhập bookID: ");
		bookID = sc.nextLine();
		System.out.print("Nhập title: ");
		title = sc.nextLine();
		System.out.print("Nhập author: ");
		author = sc.nextLine();
		System.out.print("Nhập quantity: ");
		quantity = sc.nextInt();
		System.out.println("Nhập giá cơ bản: ");
		giaCoBan = sc.nextDouble();
		System.out.print("Nhập publicationYear: ");
		publicationYear = sc.nextInt();
		sc.nextLine();
	}

	public String toString() {
		return "BookID: " + bookID + "\nTitle: " + title + "\nAuthor: " + author + "\nPublication Year: "
				+ publicationYear + "\nQuantity: " + quantity;
	}

	public abstract double tinhGiaBan();
}
