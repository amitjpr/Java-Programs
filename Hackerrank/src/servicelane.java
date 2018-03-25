import java.util.Scanner;

public class servicelane {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0 ; i< n ;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0 ; i< t ; i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int min=Integer.MAX_VALUE ;
			for(int j=a ; j<=b ;j++)
			{
				if(arr[j]<=min)
				{
					min=arr[j];
				}
			}
			System.out.println(min);
		}
       sc.close();
	}

}
