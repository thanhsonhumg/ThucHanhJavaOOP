package main;

import custumer.VIPcustumer;
import custumer.custumer;
import person.person;

public class AppCustumer {
    public static void main(String[] args) {
        person cus = new custumer();
        cus.nhapTenTuoi();
        
        person vipcus = new VIPcustumer();
        vipcus.nhapTenTuoi();
        
        custumer cus1 = new custumer();
        cus1.nhapCustumer();
        
        VIPcustumer vipcus1 = new VIPcustumer();
        vipcus1.nhapVIPCustumer();
    }

}
