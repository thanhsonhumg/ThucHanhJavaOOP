package person;

import java.util.Scanner;

public class person {
    public String Ten;
    public int Tuoi;

    public void nhapTenTuoi() {
        System.out.println("Nhap vao ho va ten: ");
        Scanner sc = new Scanner(System.in);
        Ten = sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        Tuoi = sc.nextInt();
        sc.close();

    }

    public void inTenTuoi() {
        System.out.println("Ho va ten: " + Ten);
        System.out.println("Tuoi: " + Tuoi);
    }

}
