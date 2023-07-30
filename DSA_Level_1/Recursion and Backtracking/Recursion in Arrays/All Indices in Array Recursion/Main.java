import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int ar[] = allIndices(arr, x, 0, 0);

    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {

        if (idx == arr.length) {
            return new int[fsf];

        }

        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;

        } else {

            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }

    }

}
