import java.util.Scanner;
public class SinhVien {
        String MaSinhVien;
        String HoTen;
        Boolean GioiTinh;
        String Diachi;
        DateTime NgaySinh;
    public void NhapthongtinSV() {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Nhap vao ma sinh vien:"); 
        MaSinhVien = scanner.nextLine();
        System.out.println("Nhap vao ho ten sinh vien:");
        HoTen = scanner.nextLine();
        System.out.println("Nhap vao gioi tinh sinh vien:");
        GioiTinh = scanner.nextBoolean();
        System.out.println("Nhap vao dia chi sinh vien:");
        scanner.nextLine();  
        Diachi = scanner.nextLine();
        System.out.println("Nhap vao ngay sinh sinh vien:");
        NgaySinh = scanner.NextDate();      
        scanner.close();          
    }
    public void Inthongtin() {
        System.out.println("MaSinhVien:" +MaSinhVien);
        System.out.println("HoTen:" +HoTen);
        System.out.print("GioiTinh:");
            if ( GioiTinh == true ) {
                System.out.println("Nam");
            } else {
                System.out.println("Nu"); }
        System.out.println("DiaChi:" +Diachi); 
    }
    public void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.NhapthongtinSV();
        sv.Inthongtin();
    }
}




