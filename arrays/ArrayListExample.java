import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(34);
        // list.add(34);
        // list.add(88);
        // list.add(5454);

        // System.out.println(list);
        // // System.out.println(list.contains(88));
        // list.set(0, 99);
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here

        }

        System.out.println(list);
    }
}
