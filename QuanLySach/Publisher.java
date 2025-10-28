import java.util.Scanner;

public class Publisher {
	private String publisherID, ten, sdt, diaChi, email;
	private Scanner sc = new Scanner(System.in);

	public Publisher(String publisherID, String ten, String sdt, String diaChi, String email) {
		this.publisherID = publisherID;
		this.ten = ten;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.email = email;
	}

	public Publisher() {

	}

	public void Nhap() {
		System.out.println("Nhap id nha xuat ban");
		publisherID = sc.nextLine();
		System.out.println("Nhap ten nha xuat ban");
		ten = sc.nextLine();
		System.out.println("Nhap sdt nha xuat ban");
		sdt = sc.nextLine();
		System.out.println("Nhap dia chi nha xuat ban");
		diaChi = sc.nextLine();
		System.out.println("Nhap email nha xuat ban");
		email = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Publisher [publisherID=" + publisherID + ", ten=" + ten + ", sdt=" + sdt + ", diaChi=" + diaChi
				+ ", email=" + email + "]";
	}

}
