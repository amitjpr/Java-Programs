import java.util.Arrays;
import java.util.Scanner;

public class Cscan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of head start");
		int n=sc.nextInt();
		System.out.println("Enter the range ");
		int max=sc.nextInt() ;
		int min =sc.nextInt();
		System.out.println("Enter the total values of the queue");
		int k = sc.nextInt() ;
		System.out.println("Enter the values of the queue");
		int arr[]=new int[k];
		
		int index= 0 ; int count= 0 ; int sum= 0 ;
		for(int i= 0 ; i<k ; i++)
		{
			arr[i]=sc.nextInt() ;
		}
        Arrays.sort(arr);
        for(int i= 0 ; i<k ; i++)
		{
			
			if(arr[i]<= n)
				index=i+1 ;
		}
       int  sum1 = Math.abs(arr[index]-n);
            sum=sum+sum1 ;
       for(int i = index+1 ; i< k ; i++)
        {   
        	count++ ;
        	if(i==1)
        		{
        		sum=arr[i-1]-min  + sum ;
        		}
        	sum = Math.abs(arr[i] - arr[i-1]) + sum ;
        	
        		
        	if (i == k-1 )
        	{   sum =( max - arr[i]) + sum ;
        		i=0 ;
        		
        	}
        	if(count== k-2)
        	{ 
        		 System.out.println("Average in C-Scan :- "+ sum/(k*1.0));
                 System.exit(0); 		
        	}
        		
        }
      sc.close(); 
	}

}
