import java.util.Scanner;

public class TextBook extends Book {
	private String monHoc, capDo;
	Scanner sc = new Scanner(System.in);

	public TextBook(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan,
			Scanner sc, String monHoc, String capDo, Scanner sc2) {
		super(bookID, title, author, quantity, publicationYear, giaCoBan, sc);
		this.monHoc = monHoc;
		this.capDo = capDo;
		sc = sc2;
	}

	public TextBook() {
		super();
	}

	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập monHoc: ");
		monHoc = sc.nextLine();
		System.out.println("Nhập cấp độ ");
		capDo = sc.nextLine();
	}

	public String toString() {
		return super.toString() + "\nmon hoc: " + monHoc + "\ncap do: " + capDo + "Gia ban:" + tinhGiaBan();
	}

	public double tinhGiaBan() {
		return getGiaCoBan() + ((2025 - getPublicationYear()) * 5000);
	}
}
