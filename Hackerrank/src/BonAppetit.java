import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt() ; 
	        int k=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i= 0 ; i< n ; i++)
	            {
	              arr[i]=sc.nextInt();
	            }
	         int bcharged=sc.nextInt() ;
	        int sum=0 ;
	        for(int i=0 ;i<n ;i++ )
	             {  if (k==(i))
	                  i ++; 
	                
	              sum =sum+arr[i] ;
	             }
	        if ((sum/2)==bcharged)
	            System.out.println("Bon Appetit") ;
	        else
	            System.out.println(bcharged-(sum/2));
	        
	        sc.close();
	}

}
