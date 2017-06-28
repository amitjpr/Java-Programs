import java.util.*;

class Average 
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in) ; 
    System.out.println("Enter the size of array");
	int n= sc.nextInt(); 
	System.out.println("Enter the numbers");
	 int a[] = new int[n]; 
	 for(int i=0 ; i<=n-1 ; i++)
	 {  a[i] = sc.nextInt() ; 
	 }
	 int sum  = 0 ; 
	for (int i =0 ; i<=n-1 ; i++ )
	  { sum=sum + a[i] ; 
	    }
		int avg= sum/n  ; 
		System.out.println("the average of the number is"+avg);	
        System.out.println("The no. above average are ");
		for (int i =0 ; i<=n-1 ; i++ )
	  { if (a[i]>avg)
         System.out.print(" "+a[i]+" "); 	  
	    }
         	   
  }
}