import java.util.Scanner ;
public class App35 {
public static void main(String[] args)  {
    int SoThuNhat, SoThuHai;
try (Scanner scanner = new Scanner(System.in)) {
    System.out.println("Nhap vao so thu nhat :") ;
    SoThuNhat = scanner.nextInt() ;
    System.out.println("Nhap vao so thu hai :") ;
    SoThuHai = scanner.nextInt() ;
}
int SoNhoNhat = SoThuNhat;
if (SoThuNhat > SoThuHai)   
    SoNhoNhat = SoThuHai;
System.out.println("So nho nhat trong hai so " +SoThuNhat+ " va " +SoThuHai+ " la : "+SoNhoNhat);
}   
}
