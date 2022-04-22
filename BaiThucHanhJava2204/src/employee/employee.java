package employee;
import java.util.Scanner;

import person.person;
public class employee extends person {
    public float Chucvu;
    public float Luong;
    public void nhapCongViec() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap chuc vu: ");
            Chucvu = sc.nextFloat();
            System.out.println("Nhap luong: ");
            Luong = sc.nextFloat();
        }
    }
    public void inCongViec() {
        System.out.println("Chuc vu: "+ Chucvu);
        System.out.println("Luong: "+ Luong);
    }
    
}
