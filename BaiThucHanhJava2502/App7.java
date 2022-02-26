import java.util.Scanner;
public class App7{
    public static void main(String[] args) {
        float n,max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thuc n: ");
        n = scanner.nextFloat();
        max = n;
        while(n != 0)
        {
            System.out.println("Nhap so thuc n: ");
            n = scanner.nextFloat();
            if(n==0)
                break;
            if(n > max)
                max = n;
        }
        System.out.println("Gia tri lon nhat trong cac so vua nhap la: " + max);
        scanner.close();
    }
}