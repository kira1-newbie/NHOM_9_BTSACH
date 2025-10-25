import java.util.Scanner;
public class Novel extends Book {
	private String theLoai;
	private boolean laSachSeries;
	Scanner sc=new Scanner(System.in);
	public Novel(String bookID,Double giaCoBan, String title, String author, int quantity, int publicationYear, String theLoai,
			boolean laSachSeries) {
		super(bookID, title, author, quantity, publicationYear,giaCoBan);
		this.theLoai = theLoai;
		this.laSachSeries = laSachSeries;
	}
	public Novel() {
	}
	@Override
	public void Nhap()
	{
		super.Nhap();
		System.out.println("Nhap the loai: ");
		theLoai=sc.nextLine();
		System.out.println("Sach co phai la Series khong:(true/false) ");
		laSachSeries=sc.nextBoolean();
	}
	@Override
	public String toString() {
		return super.toString() + "\nthe loai: " + theLoai + "\nla sach series: " + laSachSeries
		+"\nGia Ban:"+tinhGiaBan();
	}
	@Override
	public double tinhGiaBan()
	{
		double gcb=getgiaCoBan();
		if(laSachSeries==true)
		return gcb+15000;
		else return gcb;
	}
	@Override
	public boolean kiemTraTonKho(int soLuongToiThieu)
	{
		if(this.getQuantity()>=soLuongToiThieu)
			return true;
		else
			return false;
	}
	@Override
	public void capNhatViTri(String viTriMoi)
	{
		System.out.println("Đa chuyen sach"+getTitle()+"den khu vuc:"+viTriMoi);
	}

}
