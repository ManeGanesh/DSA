import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        list.add(10);
        list.add(20);

        int val = list.get(1);
        System.out.println(val);

        list.set(1, 2000);
        System.out.println(list + " ->" + list.size());

        list.remove(1);
        System.out.println(list + " ->" + list.size());

        ArrayList<String> l2 = new ArrayList<>();

        l2.add("hello");
        l2.add("Bello");
        l2.add("Cello");

        System.out.println(l2);
        System.out.println(l2.size());

        for (int i = 0; i < list.size(); i++) {

            int value = list.get(i);
            System.out.println(value);

        }

        for (int val1 : list) {
            System.out.println(val1);

        }

        System.out.println(list);

    }

}
