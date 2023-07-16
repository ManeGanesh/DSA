import java.io.*;
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

    static class Pair{

        int v;
        String psf;


        Pair(int v,String psf)
        {
            this.v=v;
            this.psf=psf;

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
        

        for(int i=0;i<vtces;i++)
        {
            if(visited[i]==false)
            {
                
               boolean cycle= IsGraphCyclic(graph,i,visited);
               if(cycle)
               {
                System.out.println(true);
                return;
               }
               

            }
        }

        System.out.println(false);
    }




    public static boolean IsGraphCyclic(ArrayList<Edge>[]graph,int src,boolean visited[])
    {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src+""));


        while(q.size() > 0)
        {

            Pair rem = q.removeFirst();

            if(visited[rem.v]==true)
            {
                return true;
            }

            visited[rem.v]=true;

            for(Edge edge: graph[rem.v])
            {
                if(visited[edge.nbr]==false)
                {
                    q.add(new Pair(edge.nbr, rem.psf+edge.nbr));
                }
            }


        }




        return false;

    }

 }







    

