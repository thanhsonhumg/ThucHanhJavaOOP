import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("C++");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("-----------------------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA: ");
        showList(listA);
        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("-----------------------------------------");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listA: ");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("-----------------------------------------");
        list.removeAll(listB);
        System.out.println("list: ");
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}
