import java.util.*;

class Grid 
{  public static void main(String args[])
   {  Scanner sc=new Scanner(System.in);
         while(sc.hasNextInt()==true)
		 {
 	     int n=sc.nextInt();
	     if(n==0)
		   {System.exit(0);
		   }
		 int sum=0;
	     for(int i=1 ; i<=n ; i++)
		   {  sum= i*i + sum ;
		   }
		System.out.println(sum);   
	     } 
   }
}