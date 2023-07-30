import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> path = getStairPaths(n);
        System.out.println(path);

    }

    public static ArrayList<String> getStairPaths(int n) 
    {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;

        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;

        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> Paths2 = getStairPaths(n - 2);
        ArrayList<String> Paths3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path1 : paths1) {
            paths.add(1 + path1);
        }

        for (String path12 : Paths2) {
            paths.add(2 + path12);
        }

        for (String path3 : Paths3) {
            paths.add(3 + path3);
        }

        return paths;

    }

}
