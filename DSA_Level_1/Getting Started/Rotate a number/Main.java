import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int len = 0;

        while (temp > 0) {

            temp = temp / 10;

            len++;

        }

        k = k % len;

        if (k < 0) {
            k = k + len;

        }

        int div = 1;
        int mul = 1;

        for (int i = 1; i <= n; i++) {

            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;

            }

            int q = n / div;
            int r = n % div;

            int res = r * mul + q;

            System.out.println(r);

        }

    }

}
