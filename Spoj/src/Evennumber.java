import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt() ;
	    for(int i=0 ;i<t ;i++)
	    { 
	    	int n=sc.nextInt();
	    	if(n%2!=0)
	    	{
	    		System.out.println(n);
	    	}else 
	    	{
	    		int r=0 ;
	    		int count=0 ;
	    		int arr[]=new int [1000];
	    		while(n>0)
	    		{
	    			r=n%2 ;
	    			arr[count]=r;
	    			n=n/2;
	    			count++ ;
	    			
	    		}
	    		int sum=0 ;
	    		
	    		for(int j=(count-1) , k=0 ;j>=0 ;j-- )
	    		{
	    			sum=sum+(int)Math.pow(2*arr[k],j );
	    			k++ ;
	    		}
	    		System.out.println(sum);
	    	}
	    	
	    }
		sc.close();
	}

}
