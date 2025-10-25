import java.util.ArrayList;
import java.util.List;
public class BookManagerImpl implements IQuanLySach{
	private List<Book> ds =new ArrayList<>();
	@Override
	public void themMoi(Book s) {
	    for (Book c : ds) {
	        if (c.equals(s)) {
	            System.out.println("Nhập trùng mã sách!");
	        return;
	        }
	    }
	    ds.add(s);
	    System.out.println("Thêm thành công!");
	}
	@Override
	public void Xoa(String ma)
	{
		if(ds.isEmpty()==true)
		{
			System.out.println("Danh sách rỗng, không thể xóa!");
		}
		else
		{
		for(Book c : ds)
		{
			if(c.getBookID().equals(ma))
			{
				ds.remove(c);
				System.out.println("Xóa thành công!");
				return;
			}
		}
		System.out.println("Xóa không được!");
		}
	}
	@Override
	public void CapNhat(String ma)
	{
		if(ds.isEmpty()==true)
		{
			System.out.println("Danh sách rỗng, không thể cập nhật!");
		}
		else
		for(int i=0;i<ds.size();i++)
		{
			Book c=ds.get(i);
			if(c.getBookID().equals(ma))
			{
				if(c instanceof Novel)
				{
					Book n=new Novel();
					n.Nhap();
					ds.set(i, n);
				}
					else if(c instanceof TextBook)
				{
					Book n=new TextBook();
					n.Nhap();
					ds.set(i, n);
				}
				System.out.println("Cập nhật thành công!");
				return;
			}
		}
	}
	@Override
	public boolean Timkiem(String ma)
	{
		if(ds.isEmpty()==true)
		{
			System.out.println("Danh sách rỗng, không thể tìm kiếm!");
		}
		else
		for(Book c : ds)
		{
			if(c.getBookID().equals(ma))
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public void displayBooks()
	{
		System.out.println("List Book");
		for(Book c:ds)
		{
			System.out.println(c.toString());
		}
	}
	@Override
	public boolean kiemTraTonKho(String ma, int soluongtoithieu) {
    for (Book b : ds) 
		if (b.getBookID().equals(ma)) 
			return b.kiemTraTonKho(soluongtoithieu);
	    System.out.println("Khong tim thay sach co ma: " + ma);
    return false;
	}
	@Override
	public void capNhatViTri(String ma, String viTriMoi) {
    for (Book b : ds) 
		if (b.getBookID().equals(ma)) 
			{ b.capNhatViTri(viTriMoi);
				return; }
    System.out.println("Khong tim thay sach!");
}
}
