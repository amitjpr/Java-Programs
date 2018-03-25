import java.util.Arrays;
import java.util.Scanner;

public class MigratingBirds {
     public static void main(String[] args)
        {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int arr[]=new int[n];
		        for(int i=0 ;i<n; i++)
		        {
		        	arr[i]=in.nextInt();
		        }
		        Arrays.sort(arr);
		        int count=1 ;
		        int max=0 ;
		        int type=0 ;
		        for(int i=0 ; i< n-1;i++)
		        {
		        	if(arr[i]==arr[i+1])
		        	{
		        		count++;
		        		if(i==n-2)
		        		{
		        			if(max<count)
			        		{ 
			        			max=count;
			        			
			        			type=arr[i];
			        			count=1 ;
			        		}
		        		}
		        	}
		        	else if(arr[i]!=arr[i+1])
		        	{
		        		if(max<count)
		        		{ 
		        			max=count;
		        			
		        			type=arr[i];
		        			count=1 ;
		        		}
		        	}
		        }
		        System.out.println(type);
		        in.close();
	  }
}

