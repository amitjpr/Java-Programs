import java.util.Scanner ; 
import java.lang.*;

class Histrogram
{  public static void main(String args[])
   {  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no u want to enter ");
      int n=sc.nextInt(); 
      System.out.println("Enter the no whoose u want to make the histogram");
       int a[]=new int[n] ;   	  
      for(int i=0 ; i<=n-1 ; i++ )
        {  a[i]=sc.nextInt() ; 
		   } 	  
	for ( int j=0 ; j<=n-1 ; j++)
      {  
      	  for(int i=0 ; i<a[j] ; i++)
           {  System.out.print("*"); 
		   } System.out.println("");   	  
	  } 	
		   
    }
}