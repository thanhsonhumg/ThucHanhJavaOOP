import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int n,max=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen : ");
            n = scanner.nextInt();
        if(n%5 == 0) {
                if(n > max)
                    max = n;
        }
        } while (n!=0);
        System.out.println("Gia tri lon nhat trong cac so vua nhap chia het cho 5 la: " + max);
        scanner.close();
    }
}