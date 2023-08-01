import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);

    }

    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int target) {

        if (idx == arr.length) {
            if (sos == target) {
                System.out.println(set + ".");
            }

            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], target);
        printTargetSumSubsets(arr, idx + 1, set, sos, target);

    }

}
