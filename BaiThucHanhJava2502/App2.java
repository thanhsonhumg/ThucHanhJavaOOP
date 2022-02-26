public class App2 {
public static void main(String[] args) {
        double a = 1.23 ;
        double b = 3.45 ;
        double c = 5.67 ;
    if ((a+b>c) || (a+c>b) || (b+c>a)) {
        System.out.println("Day la tam giac.");
    }
    else {
        System.out.println("Day khong phai tam giac.");
    }
    if((a==b) || (a==c) || (b==c)){
        System.out.println("Day la tam giac can.");
    }
    else if ((a==b) && (a==c) && (b==c)) {
        System.out.println("Day la tam giac deu.");
    }
    else if ((a*a==b*b+c*c) || (b*b==a*a+c*c) || (c*c==a*a+b*b)) {
        System.out.println("Day la tam giac vuong.");
    }   
}
}
