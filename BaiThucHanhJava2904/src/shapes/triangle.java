package shapes;

import java.lang.Math;

public class triangle extends point {
    private double AB, AC, BC;

    public void nhap3Point() {
        point p1 = new point();
        System.out.println("Nhap diem A: ");
        p1.nhapPoint();

        point p2 = new point();
        System.out.println("Nhap diem B: ");
        p2.nhapPoint();

        point p3 = new point();
        System.out.println("Nhap diem C: ");
        p3.nhapPoint();

        AB = Math.sqrt(Math.pow(p2.tungDo - p1.tungDo, 2) + Math.pow(p2.hoanhDo - p1.hoanhDo, 2));
        System.out.println("AB = " + AB);
        AC = Math.sqrt(Math.pow(p3.tungDo - p1.tungDo, 2) + Math.pow(p3.hoanhDo - p1.hoanhDo, 2));
        System.out.println("AC = " + AC);
        BC = Math.sqrt(Math.pow(p3.tungDo - p2.tungDo, 2) + Math.pow(p3.hoanhDo - p2.hoanhDo, 2));
        System.out.println("BC = " + BC);
    }

    public void soSanhTamGiac() {
        if (AB + BC > AC && AB + AC > BC && BC + AC > AB) {
            System.out.println("Ba diem vua nhap la 1 tam giac!");
            if (AB == BC && BC == AC && AC == AB) {
                System.out.println("Va do la tam giac deu!");
            } else if (AB == BC || AB == AC || AC == BC) {
                System.out.println("Va do la tam giac can!");
            } else if ((AB * AB == BC * BC + AC * AC) || (BC * BC == AB * AB + AC * AC)
                    || (AC * AC == BC * BC + AB * AB)) {
                System.out.println("Va do la tam giac vuong!");
            }
        } else {
            System.out.println("Ba diem vua nhap khong la tam giac!");
        }
    }
}
