import java.awt.print.Printable;
import java.util.Scanner;

public class Birthday_chocolate 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt() ;
		int arr[]=new int[n];
		for(int i=0 ; i< n ; i++ )
		{
			arr[i]=sc.nextInt() ;
		}
		int d = sc.nextInt() ;
		int m =sc.nextInt() ;
		int count = 0 ; 
		if (m==1)
		{
		  for (int i = 0 ; i < n ; i++ )
		  {
			  if (arr[i]==d )
				  count++ ; 
		  }
		}
	    else
			{
	    	int sum=0  ;
		for (int i = 0 ; i <=(n-m ); i++ )
		      {    
			 sum = 0 ;
			 for(int j = i ; j < (i+m ) ; j++ )
			 {
			      sum= arr[j]+sum ; 	 
			 }
			 System.out.println(sum);
			 if (sum == d)
				 count++ ;
		     }
		
			}
		System.out.println(count);
        sc.close();
	}

}
