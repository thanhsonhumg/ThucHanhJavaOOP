//Bài tập giải phương trình bậc 2
package BaiThucHanhJava.BaiThucHanhJava2101;
import java.util.Scanner;
public class App1 {
public static void main(String[] args) throws Exception{
    double hsA, hsB, hsC, delta;
    double x1, x2;
    try (Scanner abc = new Scanner(System.in)) {
        System.out.println("Nhap vao he so A:");
            hsA = abc.nextDouble();
        System.out.println("Nhap vao he so B:"); 
            hsB = abc.nextDouble();  
        System.out.println("Nhap vao he so C;");
            hsC = abc.nextDouble();
    }  
        delta = hsB * hsB - 4 * hsA * hsC;
        if (delta > 0) {
            x1 = (-hsB + Math.sqrt(delta)) / (2*hsA);
            x2 = (-hsB - Math.sqrt(delta)) / (2*hsA);
            System.out.println("Phuong trinh co hai nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-hsB / (2 * hsA));
            System.out.println("Phuong trinh co nghiem kep la: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
    }
}
}