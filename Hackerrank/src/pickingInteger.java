import java.util.Arrays;
import java.util.Scanner;

public class pickingInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0 ; i< n ; i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int count=1 , max=0 ;
		
		for(int i=0 ; i < n-1 ;i++)
		{    
			a : for(int j=i+1 ;j<n ;j++)
			{
			   if(arr[j]-arr[i]<=1)
			   {
				   count++ ;
				  
				   if(j== n-1)
				   {
					   if(count>max)
					   {
						   max=count ;
						    
					   }
					   count=1 ;
				   }
			   }
			   else 
			   {
				   if(count>max)
				   {
					   max=count ;
				   }
					   count=1 ; 
					  
				   
				   break a;
			   }
			   
			}
		}
       System.out.println(max);
	}

}
