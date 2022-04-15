package shapes;

import java.util.Scanner;

public class HinhTru extends Hinhtron {
    public float chieuCao;
    public float theTich;

    public HinhTru() {
        ten = "Hinh Tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.println("Chieu Cao =");
        try (Scanner sc = new Scanner(System.in)) {
            chieuCao = sc.nextFloat();
        }

    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }

}
