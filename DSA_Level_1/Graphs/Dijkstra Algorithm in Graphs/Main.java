import java.io.*;
import java.util.*;


public class Main 
{


    static class Edge
    {

        int src;
        int nbr;
        int wt;


        Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;

        }
    }

    static class Pair implements Comparable<Pair>{

        int v;
        int wsf;
        String psf;


        Pair(int v,int wsf,String psf)
        {
            this.v=v;
            this.wsf=wsf;
            this.psf=psf;

        }

        public int compareTo(Pair o)
        {
           return  this.wsf-o.wsf;
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
            int wt=Integer.parseInt(parts[2]);

            graph[v1].add(new Edge(v1, v2,wt));
            graph[v2].add(new Edge(v2, v1,wt));
        }


        boolean visited [] = new boolean[vtces];
        int src=Integer.parseInt(br.readLine());


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0,src+""));


        while(pq.size()>0)
        {

            Pair rem = pq.remove();
            if(visited[rem.v]==true)
            {
                continue;

            }

            visited[rem.v]=true;

            System.out.println(rem.v +"via" + rem.psf + "@" + rem.wsf);


            for(Edge e : graph[rem.v])
            {
                if(visited[e.nbr]==false)
                {
                    pq.add(new Pair(e.nbr, rem.wsf+e.wt, rem.psf+e.nbr));
                }
            }



        }

        
        
    }








       
    }

 







    

