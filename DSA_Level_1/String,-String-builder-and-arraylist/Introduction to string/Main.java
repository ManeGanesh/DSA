import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); // hello Ganesh
        String s2 = sc.next();

        System.out.println(s1); // it will print hello
        System.out.println(s2); // it will print Ganesh

        String s3 = sc.nextLine();
        System.out.println(s3); // it will print hello Ganesh

        System.out.println(s3.length());

        System.out.print(s3.charAt(0));// it will print h

        for (int i = 0; i < s3.length(); i++) {
            System.out.print(s3.charAt(i));

        }

        // substring

        String s = "abcd";

        System.out.println(s.substring(1, 3)); // it will print ab

        // printing all substring of abcd
        for (int i = 0; i < s.length(); i++) {

            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }

        String ss = "abc def ghi";

        String[] parts = ss.split(" ");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }

}
