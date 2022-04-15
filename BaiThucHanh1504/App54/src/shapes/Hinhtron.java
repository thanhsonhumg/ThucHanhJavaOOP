package shapes;

import java.util.Scanner;

public class Hinhtron extends HinhHoc {
    public float banKinh;

    public Hinhtron() {
        ten = "Hinh Tron";
    }

    public void nhapBanKinh() {
        System.out.println("Ban Kinh = ");
        try (Scanner sc = new Scanner(System.in)) {
            banKinh = sc.nextFloat();
        }
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }

}
