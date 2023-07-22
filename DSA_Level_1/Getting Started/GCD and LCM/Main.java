import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;

        while (on1 % on2 != 0) {

            int rem = on1 % on2;

            on1 = on2;
            on2 = rem;

        }

        int gcd = on2;
        int lcm = (n1 * n2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }

}
