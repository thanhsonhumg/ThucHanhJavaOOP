package shapes;

import java.util.Scanner;

public class Hinhvuong extends HinhChuNhat {
    // Constructor
    public Hinhvuong() {
        ten = " Hinh Vuong ";

    }

    public void nhapCanh() {
        System.out.println("Canh = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = rong = sc.nextFloat();
        }
    }

}