package person;

import java.util.Scanner;

public class student extends person {
    public String Truong;
    public String Lop;

    public void nhapTruong() {
        System.out.println("Nhap truong: ");
        try (Scanner sc = new Scanner(System.in)) {
            Truong = sc.nextLine();
        }
    }

    public void nhapLop() {
        System.out.println("Nhap lop: ");
        Scanner sc = new Scanner(System.in);
        Lop = sc.nextLine();
        sc.close();
    }

    public void inThongTin() {
        System.out.println("Truong: " + Truong);
        System.out.println("Lop: " + Lop);

    }

}
