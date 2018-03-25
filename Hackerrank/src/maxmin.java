import java.util.Arrays;
import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0 ;i<n ;i++)
		{
			arr[i]=sc.nextInt();
		}
       Arrays.sort(arr);
       int res=Integer.MAX_VALUE;
       for(int i=0 ;i<(n-k+1) ;i++)
       {
    	   res=Math.min(res, arr[(k+i)-1]-arr[i]);
       }
       System.out.println(res);
	}

}
