import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) throws Exception {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(1.69f);
        arrListFloat.add(7.82f);
        arrListFloat.add(5.08f);

        Iterator<Float> iterator = arrListFloat.iterator();

        System.out.println("Cac phan tu co trong arrListFloat la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}