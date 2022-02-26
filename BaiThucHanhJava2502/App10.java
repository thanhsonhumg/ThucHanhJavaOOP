import java.util.Scanner;
public class App10 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n, count = 0;     
        System.out.println("Nhap vao mot so nguyen duong n bat ky: ");
        n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("So nhap vao khong hop le. Moi nhap lai: ");
            n = scanner.nextInt();
        }      
        while (n > 0) {
            n /= 10;
            count++;    
        }        
        System.out.println("So cac chu so = " + count);
  }
}
 