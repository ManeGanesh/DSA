import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int max = a;

        if (b >= a) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {

            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);

        } else {
            boolean flag = ((a * a + b * b) == (c * c));
            System.out.println(flag);
        }

    }

}
