import java.time.LocalDate;

public class TextBook extends Book {
	private String monHoc, capDo;

	public TextBook(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan,
			Publisher NhaXuatBan, String monHoc, String capDo) {
		super(bookID, title, author, quantity, publicationYear, giaCoBan, NhaXuatBan);
		this.monHoc = monHoc;
		this.capDo = capDo;
	}

	public TextBook() {
	}

	public void Nhap() {
		super.Nhap();
		System.out.println("Nhap monHoc: ");
		monHoc = sc.nextLine();
		System.out.println("Nhập cap do ");
		capDo = sc.nextLine();
	}

	public String toString() {
		return super.toString() + "\nmon hoc: " + monHoc + "\ncap do: " + capDo + "\nGia Ban:" + tinhGiaBan();
	}

	public double tinhGiaBan() {
		int namhientai = LocalDate.now().getYear();
		return getgiaCoBan() + ((namhientai - getPublicationYear()) * 5000);
	}

	public boolean kiemTraTonKho(int soLuongToiThieu) {
		if (getQuantity() >= soLuongToiThieu)
			return true;
		else
			return false;
	}

	public void capNhatViTri(String viTriMoi) {
		System.out.println("Da chuyen sach" + getTitle() + "den khu vuc:" + viTriMoi);
	}
}
