import java.util.Scanner;

class Fact 
 { public static void main (String args[])
    {  Scanner sc=new Scanner(System.in);
	   int t= sc.nextInt();
	   
        if(t<=100 && t>=1)	 
       {		
       	int a[]=new int[t];
        for (int i = 0 ; i<t ; i++)
           a[i]=sc.nextInt() ; 

         for( int i=0 ; i< t ; i++) 
		   {  long  fact =1L ;
		       for (int n =a[i]  ; n>0 ; n-- )
		        fact=n*fact ;
                System.out.println(fact) ;  				
			 }
		   
	    }
	}
  }