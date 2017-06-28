import java.util.*; 

class Sort 
  {  public static void main(String args[])
       {    Scanner sc=new Scanner(System.in) ; 
	        System.out.println("Enter the size of array  ") ; 
			int n=sc.nextInt() ; 
            int a[]=new int[n] ;
            int i = 0 ,c; 			
			 System.out.println("Enter the numbers ") ; 
			 for( i =0 ; i<=n-1; i++) 
			   {  a[i]=sc.nextInt() ;      
				 }
		    for(int j=1 ; j<=n-1 ; j++)
			{
				 
               for ( i=1 ; i<=n-1 ; i++)
                  {   if ( a[i-1]>a[i] )
			        {   c=a[i] ;
				        a[i]=a[i-1] ; 
				    	a[i-1]=c ;  
					}
			      } 			
	        } 
			System.out.println("After sorting : ") ; 
			for( i =0 ; i<=n-1; i++) 
			   {  System.out.print(a[i]+" ") ;      
				 }			
	   }
	}   
	  
 