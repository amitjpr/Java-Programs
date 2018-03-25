import java.util.Scanner;

public class leftrotatethearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		for(int i=0 ;i<n ;i++)
			arr[i]=sc.nextInt();
		if(d>0)
		{
	      	for(int i =d ; i<n ; i++)
		      {
			       System.out.print(arr[i]+" ");
			       count++;
			       if(count==n)
			    	   System.exit(0);
			       if(i==(n-1))
			    	   i=-1;
			       
		      }
		}
		else if(d==0)
		{
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
