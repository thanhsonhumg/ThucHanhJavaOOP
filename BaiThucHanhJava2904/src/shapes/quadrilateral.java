package shapes;

public class quadrilateral extends point {
    private float AB;
    private float BC;
    private float CD;
    private float AD;
    private float temp1_3;
    private float temp2_4;
    private int vuong;

    public void nhap4Diem() {
        point p1 = new point();
        System.out.println("Nhap A: ");
        p1.nhapPoint();

        point p2 = new point();
        System.out.println("Nhap B: ");
        p2.nhapPoint();

        point p3 = new point();
        System.out.println("Nhap C: ");
        p3.nhapPoint();

        point p4 = new point();
        System.out.println("Nhap D: ");
        p4.nhapPoint();

        AB = (float) Math.sqrt(Math.pow(p1.hoanhDo - p2.hoanhDo, 2) + Math.pow(p1.tungDo - p2.tungDo, 2));
        System.out.println("AB= " + AB);
        BC = (float) Math.sqrt(Math.pow(p2.hoanhDo - p3.hoanhDo, 2) + Math.pow(p2.tungDo - p3.tungDo, 2));
        System.out.println("BC= " + BC);
        CD = (float) Math.sqrt(Math.pow(p3.hoanhDo - p4.hoanhDo, 2) + Math.pow(p3.tungDo - p4.tungDo, 2));
        System.out.println("CD= " + CD);
        AD = (float) Math.sqrt(Math.pow(p4.hoanhDo - p1.hoanhDo, 2) + Math.pow(p4.tungDo - p1.tungDo, 2));
        System.out.println("AD= " + AD);
        temp1_3 = (float) Math.sqrt(Math.pow(p1.hoanhDo - p3.hoanhDo, 2) + Math.pow(p1.tungDo - p3.tungDo, 2));
        System.out.println("Temp 1: " + temp1_3);
        temp2_4 = (float) Math.sqrt(Math.pow(p2.hoanhDo - p4.hoanhDo, 2) + Math.pow(p2.tungDo - p4.tungDo, 2));
        System.out.println("Temp2: " + temp2_4);
    }

    public Boolean kiemTraTuGiac() {
        if (AB + BC == temp1_3 || BC + CD == temp2_4 || CD + AD == temp1_3 || AB + AD == temp2_4)
            return false;
        else
            return true;
    }

    public void soSanhLoaiTuGiac() {
        vuong = 0;
        if (kiemTraTuGiac() == true) {
            // Ktra goc vuong
            if (Math.pow(AB, 2) + Math.pow(BC, 2) == Math.pow(temp1_3, 2))
                vuong++;
            if (Math.pow(BC, 2) + Math.pow(CD, 2) == Math.pow(temp2_4, 2))
                vuong++;
            if (Math.pow(CD, 2) + Math.pow(AD, 2) == Math.pow(temp1_3, 2))
                vuong++;
            if (Math.pow(AB, 2) + Math.pow(AD, 2) == Math.pow(temp2_4, 2))
                vuong++;

            if (AB == BC && CD == AD && BC == CD) {
                if (vuong >= 1)
                    System.out.print("Hinh vuong.");
                else
                    System.out.print("Hinh thoi.");
            } else if (AB == CD || BC == AD) {
                if (vuong >= 1)
                    System.out.print("Hinh chu nhat.");
                else
                    System.out.print("Hinh binh hanh.");
            }
            System.out.print("Tu giac thuong");
        } else
            System.out.print("Khong phai la tu giac");
    }
}
