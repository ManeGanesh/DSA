import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pos = 1;
        int inv = 0;

        while (n != 0) {
            int od = n % 10;
            int id = pos;
            int ip = od;

            inv = inv + id * (int) Math.pow(10, ip - 1);

            n = n / 10;

            pos++;
        }

        System.out.println(inv);

    }

}
