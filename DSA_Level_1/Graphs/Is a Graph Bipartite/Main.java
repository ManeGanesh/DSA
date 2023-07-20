import java.io.*;
import java.util.*;

public class Main {

    static class Edge {

        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;

        }
    }

    static class Pair {

        int v;
        String psf;
        int level;

        Pair(int v, String psf, int level) {
            this.v = v;
            this.psf = psf;
            this.level = level;

        }
    }

    public static void main(String arga[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[vtces];

        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edge = Integer.parseInt(br.readLine());

        for (int i = 0; i < edge; i++) {
            String parts[] = br.readLine().split(" ");

            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int visited[] = new int[vtces];
        Arrays.fill(visited, -1);

        for (int i = 0; i < vtces; i++) {
            if (visited[i] != -1) {

                boolean cycle = IsGraphBipartite(graph, i, visited);
                if (cycle == false) {
                    System.out.println(false);
                    return;
                }

            }
        }

        System.out.println(true);
    }

    public static boolean IsGraphBipartite(ArrayList<Edge>[] graph, int src, int visited[]) {

        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + "", 0));

        while (q.size() > 0) {

            Pair rem = q.removeFirst();

            if (visited[rem.v] != -1) {
                if (rem.level != visited[rem.v]) {
                    return false;
                }

            } else {

                visited[rem.v] = rem.level;
            }

            for (Edge edge : graph[src]) {

                if (visited[edge.nbr] == -1) {
                    q.add(new Pair(edge.nbr, rem.psf + edge.nbr, rem.level + 1));
                }

            }

        }

        return true;

    }

}
