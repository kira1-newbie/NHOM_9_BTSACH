
public class Novel extends Book {
	private String theLoai;
	private boolean laSachSeries;

	public Novel(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan,
			Publisher NhaXuatBan, String theLoai, boolean laSachSeries) {
		super(bookID, title, author, quantity, publicationYear, giaCoBan, NhaXuatBan);
		this.theLoai = theLoai;
		this.laSachSeries = laSachSeries;
	}

	public Novel() {
	}

	public void Nhap() {
		super.Nhap();
		System.out.println("Nhap the loai: ");
		theLoai = sc.nextLine();
		System.out.println("Sach co phai la Series khong:(true/false) ");
		laSachSeries = sc.nextBoolean();
	}

	public String toString() {
		return super.toString() + "\nthe loai: " + theLoai + "\nla sach series: " + laSachSeries + "\nGia Ban:"
				+ tinhGiaBan();
	}

	public double tinhGiaBan() {
		double gcb = getgiaCoBan();
		if (laSachSeries == true)
			return gcb + 15000;
		else
			return gcb;
	}

	public boolean kiemTraTonKho(int soLuongToiThieu) {
		if (this.getQuantity() >= soLuongToiThieu)
			return true;
		else
			return false;
	}

	public void capNhatViTri(String viTriMoi) {
		System.out.println("Đa chuyen sach" + getTitle() + "den khu vuc:" + viTriMoi);
	}

}
