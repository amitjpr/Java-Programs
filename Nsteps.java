import java.util.*; 

class Nsteps
{  public static void main(String args[])
     { Scanner sc=new Scanner(System.in);
       int t = sc.nextInt() ;
       int a[]=new int[t] ;
       int b[]=new int[t] ;	   
       for(int i=0 , j =0 ; i<t ; i++ )
          { a[i]=sc.nextInt() ; 
		    b[i]=sc.nextInt();
		      }  
       for(int i=0 , j =0 ; i<t ; i++ )
          { if (b[i]<=a[i] && b[i]>=a[i]-2) 
		      {
			   if(a[i]%2==0 && b[i]%2==0 )
		        { System.out.println(a[i]+b[i]);
			    }
			   else if ( a[i]%2!=0 && b[i]%2!=0)
			     {System.out.println(a[i]+b[i]-1);
			    }
			   else 
			    System.out.println("No Number");
               } else 				
			   System.out.println("No Number");
		 } 
	}
}