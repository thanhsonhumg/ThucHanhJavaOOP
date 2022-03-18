import java.util.Scanner;
public class HinhVuong {
        static float canhhv;
        static float chuvi;
        static float dientich;
    public void Nhapcanhhv() {
        System.out.println("Nhap canh hinh vuong:");
        try (Scanner scanner = new Scanner(System.in)) {
            canhhv = scanner.nextFloat();
        }
    }
    float Tinhchuvihv() {
        chuvi = canhhv*4;
        return chuvi;
    } 
    float Tinhdientichhv() {
        dientich = canhhv*canhhv;
        return dientich;
    }
    public static void main(String[] args) {
            HinhVuong hv = new HinhVuong();
            hv.Nhapcanhhv();
            System.out.println("Canh hinh vuong la:" +canhhv);
            hv.Tinhchuvihv();
            System.out.println("Chu vi hinh vuong la:" +chuvi);
            hv.Tinhdientichhv();
            System.out.println("Dien tich hinh vuong la:" +dientich);
    }
}
    