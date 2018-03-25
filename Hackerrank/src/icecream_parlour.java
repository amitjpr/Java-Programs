import java.util.Scanner;

public class icecream_parlour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int  i =0 ; i<t ; i++)
		{
			int a= sc.nextInt();
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0 ;j<n ;j++)
			{
				arr[i]=sc.nextInt();
			}
			for(int j=0 ; j< n-1 ;j++ )
			{  int sum=0 ;
				for (int k=j+1 ; k<n ; k++)
				{
					sum= arr[j]+arr[k];
					if(sum == a)
					{
						System.out.println((j+1)+" "+(k+1));
					}
				}
				
			}
			
		}
		sc.close();

	}

}
