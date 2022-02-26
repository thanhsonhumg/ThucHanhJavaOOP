import java.util.Scanner;
public class App1 { 
public static void main(String[] args) {
    int a, b;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Nhap vao so nguyen duong a :");
        a = scanner.nextInt();
        System.out.println("Nhap vao so nguyen duong b :");
        b = scanner.nextInt();
    System.out.println("UCLN cua " + a + " va " + b
                + " la: " + UCLN(a, b));}
    }
    public static int UCLN(int a,int b) {
    if (b == 0) return a;
        return UCLN(b, a % b);
    }
}

