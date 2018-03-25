import java.util.Arrays;
import java.util.Scanner;

public class MinabsolutDiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0 ; i<n ;i++)
		{	a[i]=sc.nextInt();
		}
		int value = Integer.MAX_VALUE;
		Arrays.sort(a);
	    for(int i=1;i<n;i++){
	        if(Math.abs((a[i-1]-a[i])) < value)
	            value = Math.abs((a[i-1]-a[i]));
	    }
	    System.out.println(value);
	
	}

}
