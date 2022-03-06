
import java.util.Scanner;
public class App3 {
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen= ");
            int n = scanner.nextInt();
            int ktra = isprime(n); 
            if( ktra == 1 ) 
                System.out.println((int)n + " la so nguyen to" ) ;
            else 
                System.out.println(n+ " khong phai la so nguyen to" ) ;
        }
}
    private static int isprime(int n){       
        int flag = 1;
        if (n <2) return flag = 0; 
        int i = 2;
        while(i <n){
            if( n%i==0 ){
                flag = 0;
                break; 
            }
            i++;
        }

        return flag;
    }

}