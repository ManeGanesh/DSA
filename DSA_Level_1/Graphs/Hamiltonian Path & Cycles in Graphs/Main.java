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

        int src = Integer.parseInt(br.readLine());


       
        HashSet<Integer> visited = new HashSet<>();
        hamiltonian(graph,src,visited,src+"",src);
     

        
    }

    public static void hamiltonian(ArrayList<Edge>[] graph, int src, HashSet<Integer> visited,String psf,int osrc) 
     {

        if(visited.size()==graph.length-1)
        {
            System.out.println(psf);

            boolean closingEdgeFound= false;


            for(Edge edge : graph[src])
            {
                if(edge.nbr==osrc)
                {

                    closingEdgeFound=true;
                    break;

                }
            }

            if(closingEdgeFound==true)
            {
                System.out.println("*");
            }
            else{

                System.out.println(".");
            }
            return;
        }




        visited.add(src);

        for(Edge edge:graph[src])
        {

            if(visited.contains(edge.nbr)==false)
            {
                hamiltonian(graph, edge.nbr, visited, psf+edge.nbr,osrc);
            }
        }

        visited.remove(src);


        

    }

}
