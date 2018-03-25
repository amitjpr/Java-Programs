import java.util.Arrays;
import java.util.Scanner;

public class teamform {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt() ;
		for(int k=0 ; k< t ; k++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[2*m];
			for(int j=0 ; j< 2*m ; j++)
			{
				arr[j]=sc.nextInt() ; 
				
			}
			Arrays.sort(arr);
			if(n%2==1)
				System.out.println("no");
			else if(n%2==0)
			{   int count=0 ;
				b :for(int j=1 ; j< 2*m ; j++)
				{
					 if(arr[j]==arr[j-1])
					 {  count=1 ;
						 System.out.println("no");
						 break b ;
					 }
					
				}
			if(count==0 )
				System.out.println("yes");
			}
		}
     sc.close();
	}

}
