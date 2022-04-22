package main;

import person.offlinestudent;
import person.onlinestudent;

public class AppStudent {
    public static void main(String[] args) throws Exception {
        onlinestudent std1 = new onlinestudent();
        std1.nhapTenTuoi();
        std1.nhapTruong();
        std1.nhapLop();
        std1.Noihoc();
        offlinestudent std2 = new offlinestudent();
        std2.nhapTenTuoi();
        std2.nhapTruong();
        std2.nhapLop();
        std2.Noihoc();
    }
}
