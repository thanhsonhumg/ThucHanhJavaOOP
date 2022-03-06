import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a: ");
        a = sc.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        b= sc.nextInt();
        System.out.println(a + " + " + b + " = "  + (a + b));
        System.out.println(a + " - " + b + " = "  + (a - b));
        System.out.println(a + " * " + b + " = "  + (a * b));
        System.out.print(a + " / " + b + " = "  + (a / b));
        System.out.println(", du : "+ (a % b));
        if (a > b)
            System.out.println(a + " > " + b);
        else if (a == b)
            System.out.println(a + " = "+ b);
        else
            System.out.println(a + " < " + b);
        sc.close();
    }
}