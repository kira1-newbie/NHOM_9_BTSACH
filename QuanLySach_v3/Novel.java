import java.util.Scanner;

public class Novel extends Book {
	private String theLoai;
	private boolean laSachSeries;
	Scanner sc = new Scanner(System.in);

	public Novel(String bookID, String title, String author, int quantity, int publicationYear, double tinhGiaCoBan,
			Scanner sc, String theLoai, boolean laSachSeries, Scanner sc2) {
		super(bookID, title, author, quantity, publicationYear, tinhGiaCoBan, sc);
		this.theLoai = theLoai;
		this.laSachSeries = laSachSeries;
		sc = sc2;
	}

	public Novel() {
		super();
	}

	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập thể loại: ");
		theLoai = sc.nextLine();
		System.out.println("Sách có phải là Series không:(true/false) ");
		laSachSeries = sc.nextBoolean();
	}

	public String toString() {
		return super.toString() + "\nthe loai: " + theLoai + "\nla sach series: " + laSachSeries + "Gia ban:"
				+ tinhGiaBan();
	}

	public double tinhGiaBan() {
		if (this.laSachSeries == true)
			return getGiaCoBan() + 15000;
		return getGiaCoBan();
	}
}
