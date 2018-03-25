import java.util.Scanner;

public class mindistance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0 ; i< n ; i++)
		{
			arr[i]=sc.nextInt() ;
		}
		int d=0 ,min =Integer.MAX_VALUE; 
		for(int i=0 ; i< n-1 ; i++)
		{
			for(int j=i+1 ; j<n ; j++)
			{
				if(arr[i]==arr[j])
				{
					d=j-i ;
					if(d<min)
						min=d ;
				}
				
			}
		} 
		if(d==0)
			System.out.println(-1);
		else
			System.out.println(min);
		sc.close();

	}

}
