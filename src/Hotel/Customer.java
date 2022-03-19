package Hotel;

import java.util.Scanner;


public class Customer {

    private String hoVaTen;
    private String soCMND;


    /*public Customer(String hoVaTen, String soCMND){
        super();
        this.hoVaTen = hoVaTen;
        this.soCMND = soCMND;
    }*/

    public Customer() {
        super();
    }

    /*public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }*/

    public String getSoCMND(){
        return soCMND;
    }

    public void nhapThongTinKhachThue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Họ Và Tên Khách Thuê Phòng: ");
        hoVaTen = scanner.nextLine();
        System.out.print("Nhập số Chứng Minh Nhân Dân của Khách: ");
        soCMND = scanner.nextLine();

    }

    public void hienThiThongTinKhach(){

        System.out.println("Họ Và Tên Khách Thuê Phòng: " + hoVaTen);
        System.out.println("Số Chứng Minh Nhân Dân của Khách: " + soCMND);

    }


}
