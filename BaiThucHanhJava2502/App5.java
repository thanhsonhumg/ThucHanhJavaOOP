
import java.util.Scanner;
public class App5 {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen= ");
        int n = scanner.nextInt();
        int check = timsohoanhao(n);
        if( check == 1 ) System.out.println(n + " la so hoan hao" ) ;
        else System.out.println(n+ " khong phai la so hoan hao" ) ;
    }
    private static int timsohoanhao(int n){
        int flag = 0, total=0;
        for (int i=1;i<n; i++){
             if (n % i == 0) total+=i;
        }
        if (total == n & n!=0) flag = 1;
        return flag;
    }
 
}