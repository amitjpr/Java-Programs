import java.util.Scanner;

public class Ambigious {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		while(sc.hasNextInt() == true)
		{
			int n=sc.nextInt();
			if(n==0)
				System.exit(0);
			int arr[]=new int[n+1];
			int arr1[]=new int[n+1];
			for(int i=1 ;i<n+1 ; i++)
			{
				arr[i]=sc.nextInt();
				arr1[arr[i]]=i ;
			}
			int count=0 ;
			b : for(int i=1 ;i< n+1 ;i++)
			{
				if(arr[i]!=arr1[i])
				{   count++ ;   
					System.out.println("not ambiguous");
					break b ;
				}
			}
			if(count==0)
				System.out.println("ambiguous");
		}
        sc.close();
	}

}
