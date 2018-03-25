import java.util.Arrays;
import java.util.Scanner;

public class greedyflorist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0 ;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int total=0,count=0,j=1;
        for(int i=n-1 ; i>=0 ;i--)
        {
        	total=(arr[i]*j)+total ;
        	count++;
        	if(count==k)
        	{
        		j++;
        		count=0 ;
        	}
        	
        }
        System.out.println(total);
	}

}
