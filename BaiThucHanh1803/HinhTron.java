import java.util.Scanner;
public class HinhTron {
        float bankinh;
        float chuvi;
        float dientich;
        final float Pi = 3.14f;
    void Nhapbankinh() {
        System.out.println("Nhap ban kinh hinh tron :");
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
        scanner.close();
    }
    void Inbankinh() {
        System.out.println("Ban kinh hinh tron la:" +bankinh);
    }
    void Tinhchuvi() {
        chuvi = 2*Pi*bankinh;
    }
    void Tinhdientich() {
        dientich = Pi*bankinh*bankinh;
    }
    void Inchuvi() {
        System.out.println("Chu vi hinh tron la:" +chuvi);
    }
    void Indientich() {
        System.out.println("Dien tich hinh tron la:" +dientich);
    }
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.Nhapbankinh();
        ht.Inbankinh();
        ht.Tinhchuvi();
        ht.Tinhdientich();
        ht.Inchuvi();
        ht.Indientich();  
}
}

