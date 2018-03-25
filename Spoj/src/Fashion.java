import java.util.Arrays;
import java.util.Scanner;

public class Fashion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt() ;
		for(int i=0 ; i<t; i++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int arr1[]=new int[n];
			int sum=0 ;
			for(int j=0 ;j<n ; j++)
			{
				arr[j]=sc.nextInt() ;
				
			}
			Arrays.sort(arr);
			for(int j=0 ;j<n ; j++)
			{
				arr1[j]=sc.nextInt() ;
				
			}
			Arrays.sort(arr1);
			for(int j=0 ;j<n ; j++)
			{
				sum=sum+(arr[j]*arr1[j]);
				
			}
			System.out.println(sum);
		}
		
		sc.close(); 

	}

}
