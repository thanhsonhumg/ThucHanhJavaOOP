import java.util.Scanner;
public class Person {
        String PersonID;
        String PersonName;
        Boolean Gender;
        String Address;
    void Nhapthongtin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ID nguoi dung:"); 
        PersonID = scanner.nextLine();
        System.out.println("Nhap vao ten nguoi dung:");
        PersonName = scanner.nextLine();
        System.out.println("Nhap vao gioi tinh nguoi dung:");
        Gender = scanner.nextBoolean();
        System.out.println("Nhap vao dia chi nguoi dung:");
        scanner.nextLine();  
        Address = scanner.nextLine();      
        scanner.close();          
    }
    void Inthongtin() {
        System.out.println("PersonID:" +PersonID);
        System.out.println("PersonName:" +PersonName);
        System.out.print("Gender:");
            if ( Gender == true ) {
                System.out.println("Nam");
            } else {
                 System.out.println("Nu"); }
        System.out.println("Address:" +Address);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.Nhapthongtin();
        person.Inthongtin();
    }
}