import java.util.Scanner;
public class Baitap5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        while (tong <100) {
            System.out.print("Nhap so nguyen: ");
            n = sc.nextInt();
            tong +=n;
        }
        System.out.println("Tong cac so da nhap la: " + tong);
        sc.close();
    }
}