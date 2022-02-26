import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        //Nhap
        do {
            System.out.println("Nhap vao so nguyen duong n : ");
            n = scanner.nextInt();
            if(n < 0)
                System.out.println("So nhap vao khong hop le !");
        } 
        while (n < 0);
            System.out.printf("Cac so hoan thien nho hon %d la: \n",n);
        if (n > 6) 
        {
            for(int i = 6;i < n;i++)
            {
                if(check(i)==true)
                    System.out.println("" +i);
            }
        }
        else 
        {
            System.out.println("Khong co so hoan thien nao nho hon "+n);
        }
        scanner.close();
    }
    public static boolean check(int n){
        int tong = 0;
        for(int i = 1;i <= n/2;i++){
            if((n % i) == 0)
                tong+=i;
        }
        if (tong == n) {
            return true;
        }
        return false;
    }
}