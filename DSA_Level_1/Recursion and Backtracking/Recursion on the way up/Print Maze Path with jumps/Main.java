import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        printMazePathswithjumps(1, 1, n, m, "");

    }

    public static void printMazePathswithjumps(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;

        }

        for (int ms = 1; ms <= dc - sc; ms++) {
            printMazePathswithjumps(sr, sc + ms, dr, dc, psf + "h" + ms);

        }

        for (int ms = 1; ms <= dr - sr; ms++) {
            printMazePathswithjumps(sr + 1, sc, dr, dc, psf + "v" + ms);
        }

        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            printMazePathswithjumps(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }

    }

}
