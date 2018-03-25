import java.util.Arrays;
import java.util.Scanner;

public class demosnakeeating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int q=sc.nextInt();
		int arr[]=new int[n];
		for(int i =0 ; i< n ; i++)
		{
			arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        int count= 0, index=0 ;
        for(int i=n-1 ; i>=0 ; i--)
        {
        	if(arr[i]>=q)
        	{   index=i ;
        		count++ ;
        	}
        }
        int c=1 , m = 0;
        for(int i=1 ; i<index ; i++)
        {
        	m=arr[i]+c;
        	if(m>=q)
        	{
        		count++;
        		c=0;
        	}
        	else
        		c++ ;
        }
        System.out.println(count);
	}

}
