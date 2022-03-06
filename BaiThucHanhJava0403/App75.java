import java.util.Scanner;
public class App75 {

    public static void main(String[] args) {
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            do {    
                System.out.print("Nhap vao so phan tu cua mang:");
                n = scanner.nextInt();
            }
            while ( n<0 );
                int N[] =new int[n];
                System.out.println("Nhap vao cac phan tu cua mang:");
            for ( int i = 0; i<n; i++) {
                System.out.println("Nhap phan thu tu " +i+": ");
                N[i] = scanner.nextInt();
            }
            int Tong =0;
            for (int i = 0; i < n; i++){
                if (N[i] % 2 == 0) {
                    Tong+=N[i];
                }
            }
            System.out.println("Tong cac phan tu trong mang la: " + Tong);
        }
   }
}
    

