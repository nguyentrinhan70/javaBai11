package nguyentrinhan70.example.com;

public class XuLyCheckedError {

	public static void main(String[] args) {

		try {
			int x = 1/0;
			System.out.println("Đây là lỗi thực thi lỗi chia cho 0");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Tạm biệt!!!");
	}

}
