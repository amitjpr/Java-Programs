import java.util.* ; 

class RevArray
{ public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array ");
	  int n =sc.nextInt() ; 
	  int a[]=new int[n] ;
      System.out.println("Enter the numbers of array");	  
	  for(int i=0 ;i<=n-1 ; i++ )
	   { a[i]=sc.nextInt() ; 	   
	    }
	System.out.println("the present array is ");
	  for(int i=0 ;i<=n-1 ; i++ )
	   {System.out.print(a[i]+ " ");
	   }
	   System.out.println(" ");
	System.out.println("Array after reversing is ");
   	for(int i=n-1 ;i>=0 ; i-- )
	   System.out.print(a[i]+ " ");
   } 
}