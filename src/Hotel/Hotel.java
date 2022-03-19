package Hotel;

import java.util.Scanner;


public class Hotel {
    private int soNgayThue;
    private String loaiPhong;
    private double giaPhong;
    private Customer nguoi;
    private String dichVu;
    private double giaDichVu;
    private float khuyenMai;
    public Hotel(){
        super();
    }

    public Hotel(int soNgayThue, String loaiPhong, double giaPhong, Customer nguoi, String dichVu, double giaDichVu, float khuyenMai){

        super();
        this.soNgayThue = soNgayThue;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
        this.dichVu = dichVu;
        this.giaDichVu = giaDichVu;
        this.khuyenMai = khuyenMai;
    }
    public Customer getNguoi(){
        return nguoi;

    }

    public void setNguoi(Customer nguoi) {
        this.nguoi = nguoi;
    }

    public void nhapThongTinCanQuanLy() {
        Scanner scanner = new Scanner(System.in);
        nguoi = new Customer();
        nguoi.nhapThongTinKhachThue();

                System.out.print("Nhập số ngày thuê phòng: ");
                soNgayThue = Integer.parseInt(scanner.nextLine());

                if (soNgayThue <= 3) {
                    khuyenMai = 0;

                } else if (soNgayThue <= 6) {
                    khuyenMai = (float) 0.1;

                } else if (soNgayThue > 7) {
                    khuyenMai = (float) 0.2;

                }

                System.out.println("Nhập loại phòng: ");
                loaiPhong = scanner.nextLine();
                switch (loaiPhong) {
                    case "VIP":
                        giaPhong = 500000;
                        break;
                    case "Medium":
                        giaPhong = 300000;
                        break;
                    case "Normal":
                        giaPhong = 150000;
                        break;
                    default:
                        System.out.println("Lỗi chọn loại phòng");
                        break;
                }
                System.out.println("Sử dụng dịch vụ: ");
                dichVu = scanner.nextLine();
                if (dichVu.equals("Yes")) {
                    giaDichVu = 100000;

                } else if (dichVu.equals("No")) {
                    giaDichVu = 0;

                }



    }


    public void hienThiThongTinCanQuanLy(){

        nguoi.hienThiThongTinKhach();
        System.out.println("Số ngày thuê phòng: " + soNgayThue);
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Giá phòng: " + giaPhong);
        System.out.println("Giá dịch vụ bữa ăn: " + giaDichVu);

    }
    public  double maKhuyenMai(){
        return soNgayThue * giaPhong * khuyenMai;
    }
    public double tinhTien(){
        return (soNgayThue * giaPhong) - maKhuyenMai() + (soNgayThue * giaDichVu);
    }


}