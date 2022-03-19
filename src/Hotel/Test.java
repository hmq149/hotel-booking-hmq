package Hotel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import static Hotel.Time.showCalendar;

public class Test {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;  // số khách trọ
            Hotel khachSan;
            // Ngày giờ
            Calendar c = Calendar.getInstance();
            System.out.println("Ngày hiện tại: ");
            showCalendar(c);

            // tạo 1 ArrayList lưu thông tin khách trọ
            ArrayList<Hotel> arrKhachSan = new ArrayList<>();

            System.out.println("Nhập số lượng khách thuê: ");
            n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                khachSan = new Hotel();
                System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
                khachSan.nhapThongTinCanQuanLy();
                arrKhachSan.add(khachSan);
            }

            // hiển thị danh sách khách trọ
            for (int i = 0; i < arrKhachSan.size(); i++) {
                System.out.println("\nThông tin khách hàng thứ " + (i+1) + ": ");
                arrKhachSan.get(i).hienThiThongTinCanQuanLy();
            }

            // tính tiền phòng khi khách hàng trả phòng
            System.out.println("\nNhập số chứng minh nhân dân của khách trả phòng: ");
            String tim = scanner.nextLine();
            for (Hotel hotel : arrKhachSan) {
                if (hotel.getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
                    System.out.println("Số tiền phòng = " + hotel.tinhTien());
                }
            }

        }

    }
