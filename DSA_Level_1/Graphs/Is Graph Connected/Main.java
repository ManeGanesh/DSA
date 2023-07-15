import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main 
{


    static class Edge
    {

        int src;
        int nbr;


        Edge(int src,int nbr)
        {
            this.src=src;
            this.nbr=nbr;

        }
    }



    public static void main(String arga[]) throws Exception
    {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[vtces];

        for(int i=0;i<vtces;i++)
        {
            graph[i]=new ArrayList<>();
        }

        int edge=Integer.parseInt(br.readLine());

        for(int i=0;i<edge;i++)
        {
            String parts[] = br.readLine().split(" ");

            int v1=Integer.parseInt(parts[0]);
            int v2=Integer.parseInt(parts[1]);

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }


        boolean visited[] = new boolean[vtces];
        ArrayList<ArrayList<Integer>> comps= new ArrayList<>();

        for(int i=0;i<vtces;i++)
        {
            if(visited[i]==false)
            {
                ArrayList<Integer> comp= new ArrayList<>();
                IsGraphConnected(graph,i,visited,comp);
                comps.add(comp);

            }
        }

        System.out.println(comps.size()==1);
    }




    public static void IsGraphConnected(ArrayList<Edge>[]graph,int src,boolean visited[],ArrayList<Integer>comp)
    {
        visited[src]=true;

        comp.add(src);

        for(Edge edge:graph[src])
        {
            if(visited[edge.nbr]==false)
            {
                IsGraphConnected(graph,edge.nbr,visited,comp);
            }

        }


    }

}





    

