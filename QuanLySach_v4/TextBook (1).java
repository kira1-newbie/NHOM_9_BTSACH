public class TextBook extends Book {
	private String monHoc,capDo;
	public TextBook(String bookID, double giaCoBan, String title, String author, int quantity, int publicationYear, String monHoc,
			String capDo) {
		super(bookID, title, author, quantity, publicationYear,giaCoBan);
		this.monHoc = monHoc;
		this.capDo = capDo;
	}
	public TextBook() {
	}
	@Override
	public void Nhap()
	{
		super.Nhap();
		System.out.println("Nhap monHoc: ");
		monHoc=sc.nextLine();
		System.out.println("Nhập cap do ");
		capDo=sc.nextLine();
	}
	@Override
	public String toString() {
		return super.toString() + "\nmon hoc: "+monHoc+"\ncap do: "+capDo
		+"\nGia Ban:"+tinhGiaBan();
	}
	@Override
	public double tinhGiaBan()
	{
		return getgiaCoBan()+((2025-getPublicationYear())*5000);
	}
		@Override
	public boolean kiemTraTonKho(int soLuongToiThieu)
	{
		if(getQuantity()>=soLuongToiThieu)
			return true;
		else
			return false;
	}
	@Override
	public void capNhatViTri(String viTriMoi)
	{
		System.out.println("Da chuyen sach"+getTitle()+"den khu vuc:"+viTriMoi);
	}
}
