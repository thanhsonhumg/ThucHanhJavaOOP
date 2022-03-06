import java.util.Scanner;
public class Baitap12 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so hang: ");
            x = sc.nextInt();
            if(x<0)
                System.out.println("So hang khong hop le. Vui long nhap lai !");
        } while (x<0);
        do {
            System.out.print("Nhap so cot: ");
            y = sc.nextInt();
            if(y<0)
                System.out.println("So cot khong hop le. Vui long nhap lai !");
        } while (y<0);
        int A[][] = new int [x][y];
        System.out.print("\nNhap cac phan tu: ");
        for(int i = 0;i < x;i++)
            for(int j = 0;j < y;j++)
                {
                    System.out.print("A[" + (i+1) +"] [" + (j+1) +" ] : ");
                    A[i][j] = sc.nextInt();
                }
        int max = A[0][0];
        for(int i = 0;i < x;i++)
            for(int j = 0;j < y;j++)
                if(max < A[i][j])
                    max = A[i][j];
        System.out.print("\nPhan tu lon nhat trong ma tran la: " + max);
        sc.close() ;
    }
}