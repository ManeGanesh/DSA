import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int sp=n/2;
        int st=1;
        int val=1;


        for(int i=1;i<=n;i++)
        {


            for(int j=0;j<=sp;j++)
            {
                System.out.println("\t");
            }

            int cval=val;

            for(int j=1;j<=st;j++)
            {

                System.out.println(cval + "\t");

                if(j<=st/2)
                {
                    cval++;
                }
                else{

                    cval--;
                }
            }



            
            if(i<=n/2)
            {
                sp--;
                st+=2;
                val++;
            }
            else
            {
                sp++;
                st-=2;
                val--;
            }


        }




        
    
    
}
