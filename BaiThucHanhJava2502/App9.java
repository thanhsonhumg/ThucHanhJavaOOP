import java.util.Scanner;
public class App9 {
    private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int a,b, sodaonguoc = 0;
    System.out.println("\n\nNhap vao so nguyen can dao nguoc: ");
    a = scanner.nextInt();
    b = a;
    while(a != 0) {
      int chuso = a % 10;
      sodaonguoc = sodaonguoc * 10 + chuso;
      a /= 10;
    }
    System.out.printf("So %d sau khi dao nguoc la : %d", b, sodaonguoc);
  }
}