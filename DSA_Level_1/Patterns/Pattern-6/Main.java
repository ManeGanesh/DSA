import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int st = n / 2 + 1;
        int sp = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < st; j++) {
                System.out.print("*\t");

            }

            for (int j = 0; j < sp; j++) {
                System.out.print("\t");

            }

            for (int j = 0; j < st; j++) {
                System.out.print("*\t");

            }

            if (i <= n / 2) {
                st--;
                sp += 2;

            } else {
                st++;
                sp -= 2;

            }

            System.out.println();

        }

    }

}
