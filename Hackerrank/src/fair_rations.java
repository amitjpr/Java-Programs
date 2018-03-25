import java.util.Scanner;

public class fair_rations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0 ;
		for(int i=0 ; i<n ;i++)
			arr[i]=sc.nextInt();
		for(int i=0 ; i<n-1 ;i++)
		{
			if(count>=n)
				System.out.println("NO");
			if(arr[i]%2!=0)
			{
				arr[i]++;
				arr[i+1]++;
				i=-1;
				count=count+2;
			}
		
		}
		if(count<n)
			System.out.print(count);
       sc.close();
	}

}
