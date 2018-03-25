import java.util.Arrays;
import java.util.Scanner;

public class Stamps {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0 ; i<t ;i++)
		{   
			int b=sc.nextInt();
			int n=sc.nextInt();
			int arr[]=new int[n];
			int count=0 ,sum=0 ;
			for (int j=0 ; j<n ;j++)
			{
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			a: for (int j=n-1 ;j>=0 ;j--)
			{     
				sum=sum+arr[j];
				count++ ;
				if(sum>=b)
				{   
					System.out.println("Scenario #"+(i+1)+":");
					System.out.println(count);
					break a ;
				}
			}
			if (sum<b)
				System.out.println("impossible");
			    System.out.println();
		}
		
        sc.close();
	}

}
