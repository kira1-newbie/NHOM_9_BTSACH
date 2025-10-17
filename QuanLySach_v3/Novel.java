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
		System.out.println("Nhập thể loại: ");
		theLoai=sc.nextLine();
		System.out.println("Sách có phải là Series không:(true/false) ");
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
}
