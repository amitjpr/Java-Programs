import java.util.Arrays;
import java.util.Scanner;

public class snakeating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=0 ;k < n ;k++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int arr[]=new int[a];
			for(int j=0 ; j< a ; j++) //Array
			{
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			int arr1[]=new int[b];
			for(int j=0 ; j< b ; j++) //no of queries
			{
				arr1[j]=sc.nextInt();
			}
			for(int j=0 ; j< b ; j++)//queries one by one execution 
			{
				int count= 0, index=0 ;
		        for(int i=a-1 ; i>=0 ; i--)
		        {
		        	if(arr[i]>=arr1[j])
		        	{   index=i ;
		        		count++ ;
		        	}
		        }
		        int c=1 , m = 0;
		        for(int i=1 ; i<index ; i++)
		        {
		        	m=arr[i]+c;
		        	if(m>=arr1[j])
		        	{
		        		count++;
		        		c=0;
		        	}
		        	else
		        		c++ ;
		        }
		        System.out.println(count);
				
			}
		  
		}
   }

}
