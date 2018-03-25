import java.util.Scanner;

public class chef_and_laptop 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   for(int k=0;k<t ;k++)
	   {
		   int n=sc.nextInt();
		   int ar[]=new int[101];
		   for(int i=0 ; i<n;i++)
		   {
			   ar[sc.nextInt()]++;
		   }
		  a: for(int i=0 ; i<101 ;i++)
		   {
			   if(ar[i]==1)
			   {
				   System.out.println(i);
				   break a;
			   }
		   }
	   }
   }
	
}
