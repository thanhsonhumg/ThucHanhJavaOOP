package custumer;

import java.util.Scanner;

import person.person;

public class custumer extends person {
    public String gioitinh;
    public String diachi;

    public void nhapCustumer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gioi tinh khach hang: ");

        gioitinh = sc.nextLine();

        System.out.println("Nhap vao dia chi khach hang: ");

        diachi = sc.nextLine();
        sc.close();
    }

    public void inCustumer() {
        System.out.println("Gioi tinh khach hang: " + gioitinh);
        System.out.println("Dia chi khach hang: " + diachi);
    }

}
