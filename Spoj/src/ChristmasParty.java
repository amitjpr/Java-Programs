import java.util.Arrays;
import java.util.Scanner;

public class ChristmasParty {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt() ;
		for (int i=0 ; i<t ; i++)
		{
			int n=sc.nextInt() ;
			int k=sc.nextInt() ;
			int arr[]=new int[n];
			for (int j=0 ; j<n ; j++)
			{
				arr[j]=sc.nextInt() ;
			}
			Arrays.sort(arr);
			if (k==1)
				System.out.println(0);
			else 
			{
			int min=arr[n-1]-arr[n-(k-1)-1];
		 for(int j= 0 ; j< n ; j++)
		 {
			 if ( (arr[j+(k-1)]-arr[j])<min)
			 {
				 min=(arr[j+(k-1)]-arr[j]);
			 }
			 if((j+k)==n)
				 break ; 
		 }
			System.out.println(min);
		}
		}
		sc.close() ;
	}
}
