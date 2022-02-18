import java.util.Scanner;
public class App47{
  public static void main(String[] args) {
    int n, tong = 0;
    try (Scanner scanner = new Scanner(System.in)) {
        do {
         System.out.println("Nhap vao mot so nguyen: ");
           n = scanner.nextInt();
           tong += n;
   } while (tong < 100);
    }     
    System.out.println("Tong cac so nguyen vua nhap = "+tong);

    }
}