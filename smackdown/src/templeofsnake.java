import java.util.Scanner;

public class templeofsnake
{
	public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0 ;k < t ;k++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int sum=0 ;
			int m=1;int count=1;
			for(int j=0 ; j< n ;j++)
			{
				arr[j]=sc.nextInt();
			}
			for(int j=0 ; j<n ;j++)
			{
			   if(j==n-1)
			   {
				   if(arr[j]<arr[j-1])
				   {
					   sum=sum+arr[j]-m ;
						m--;
				   }
			   }
				else if(arr[j]<=arr[j+1])
				{    
					if(arr[j]==arr[j+1])
					sum=sum+arr[j];
					
					else
					{
						sum=sum+arr[j]-m ;
						m++;
					}
				}
				else if(arr[j]>=arr[j+1])
				{
					if(arr[j]==arr[j+1])
						sum=sum+arr[j+1];
					else
					{
						sum=sum+arr[j]-m ;
						m--;
					}
				}
				
			}System.out.println(sum);
		}
	}
}
			
			
		
	

	



