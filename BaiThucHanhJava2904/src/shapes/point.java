package shapes;

import java.util.Scanner;

public class point {
    public String tenDiem;
    public float tungDo;
    public float hoanhDo;

    // Ham khoi tao khong tham so
    public point() {
        setTenDiem("A");
        setTungDo(0);
        setHoanhDo(0);
    }

    // Ham khoi tao 3 tham so ten diem, tung do va hoanh do
    public point(String ten, float tung, float hoanh) {
        setTenDiem(ten);
        setTungDo(tung);
        setHoanhDo(hoanh);
    }

    public void setTenDiem(String ten) {
        this.tenDiem = ten;
    }

    public void setTungDo(float tung) {
        this.tungDo = tung;
    }

    public void setHoanhDo(float hoanh) {
        this.hoanhDo = hoanh;
    }

    public String getTenDiem() {
        return tenDiem;
    }

    public float getTungDo() {
        return tungDo;
    }

    public float getHoanhDo() {
        return hoanhDo;
    }

    public void nhapPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten diem: ");
        tenDiem = sc.nextLine();
        System.out.print("Nhap vao tung do: ");
        tungDo = sc.nextFloat();
        System.out.print("Nhap vao hoanh do: ");
        hoanhDo = sc.nextFloat();
    }

    public void inPoint() {
        System.out.println("Diem " + getTenDiem() + "(" + getTungDo() + "," + getHoanhDo() + ")");
    }
}
