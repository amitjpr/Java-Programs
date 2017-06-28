import java.util.*;

class Greatestcf
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter the two numberes ");
	int n=sc.nextInt(); 
	int m=sc.nextInt();
	
	if (n>=m)
    { for (int i=2 ; i<=m ; i++)
	  {   if( n%i==0 && m%i==0)
	      System.out.print(" "+i+" ");
	  }
	}
	else
	    { for (int i=2 ; i<=n ; i++)
	       { if( n%i==0 && m%i==0)
	         System.out.print(" "+i+" ");
	       }
	    } 
	else 
      System.out.print(" their is no common factor ");	

	}
}