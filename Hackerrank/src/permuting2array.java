import java.util.Arrays;
import java.util.Scanner;

public class permuting2array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0 ; i< t ;i++)
		{
			int n=sc.nextInt(); 
			int k=sc.nextInt();
			long sum=0l;
			int arr[]=new int[n];
			int arr1[]=new int[n];
			for(int j=0 ; j< n ; j++)
			{
				arr[j]=sc.nextInt();
			}
			for(int j=0 ; j< n ; j++)
			{
				arr1[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			Arrays.sort(arr1);
			int count=0 ;
			a : for(int j=0 ; j<n ;j++)
			{
				sum= arr[j] + arr1[n-1-j];
			
				if(sum < k)
				{
					System.out.println("NO");
					count=0 ;
					break a;
				}	
				count++ ;
			}
			if(count>0)
				System.out.println("YES");
		}
		
        sc.close();
	}

}
