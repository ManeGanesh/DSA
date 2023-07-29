import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int ans = power(x, n);

        System.out.println(ans);

    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

}
