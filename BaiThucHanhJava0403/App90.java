import java.util.Scanner;
public class App90 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ki tu bat ki: ");
        chuoi = scanner.nextLine();
        for(int i = 0;i < chuoi.length();i++)
        {
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
        scanner.close();
    }
}