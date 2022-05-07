import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(0);
        arrListInteger.add(1);
        arrListInteger.add(7);
        arrListInteger.add(5);

        System.out.println("Cac phan tu co trong arrListInteger: ");
        for (int number : arrListInteger) {
            System.out.println(number + "\t");
        } 
    }
}