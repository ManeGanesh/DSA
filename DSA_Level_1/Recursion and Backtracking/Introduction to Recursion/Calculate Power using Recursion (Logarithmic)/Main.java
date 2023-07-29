import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = sc.nextInt();

        int xn = power(x, n);
        System.out.println(xn);

    }

    public static int power(int n, int x) {

        if (x == 0) {
            return 1;
        }

        int xpnb2 = power(n / 2, x);
        int xn = xpnb2 * xpnb2;

        if (n % 2 == 1) {
            xn = xn * x;

        }

        return xn;
    }

}
