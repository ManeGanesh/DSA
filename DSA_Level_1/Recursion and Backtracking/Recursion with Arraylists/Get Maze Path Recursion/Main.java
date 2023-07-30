import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePath(1, 1, n, m);

    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");

            return bres;

        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc) {
            hpaths = getMazePath(sr, sc + 1, dr, dc);
        }

        if (sr < dr) {
            vpaths = getMazePath(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for (String path : hpaths) {
            paths.add("h" + path);
        }

        for (String path : vpaths) {
            vpaths.add("v" + path);
        }

        return paths;

    }

}
