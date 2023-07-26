import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        int minr = 0;
        int minc = 0;
        int maxr = arr.length;
        int maxc = arr[0].length;
        int cnt = 0;
        int tne = m * n;

        while (cnt < tne) {
            // left wall

            for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
                System.out.println(arr[i][j]);
                cnt++;

            }

            minc++;

            for (int i = maxr, j = minc; j <= maxc && cnt < tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;

            }

            maxr--;

            for (int i = maxr, j = maxc; i >= minr && cnt < tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;

            }

            maxc--;

            for (int i = minr, j = maxc; j > -minc && cnt < tne; j--) {
                System.out.println(arr[i][j]);
                cnt++;

            }

            minr++;

        }

    }

}
