package main;

import employee.employee;
import employee.fulltimeemployee;
import employee.parttimeemployee;

public class AppEmployee {
    public static void main(String[] args) {
        employee emp = new fulltimeemployee();
        emp.nhapTenTuoi();
        emp.nhapCongViec();

        employee emp1 = new parttimeemployee();
        emp1.nhapTenTuoi();
        emp1.nhapCongViec();

        parttimeemployee ptemp = new parttimeemployee();
        ptemp.nhapCongViec();

        fulltimeemployee flemp = new fulltimeemployee();
        flemp.nhapCongViec();
    }

}
