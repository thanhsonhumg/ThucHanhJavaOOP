package employee;

import java.util.Scanner;

public class parttimeemployee extends employee {
    public String thoigianlam;

    public void nhapThoiGianLam() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap thoi gian lam: ");
            thoigianlam = sc.nextLine();
        }

    }

    public void inThoiGianLam() {
        System.out.println("Thoi gian lam: " + thoigianlam);
    }

}
