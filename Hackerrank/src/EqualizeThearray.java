import java.util.Arrays;
import java.util.Scanner;

public class EqualizeThearray {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in) ;
      int n= sc.nextInt() ;
      int arr[]=new int[n];
      for(int i=0 ; i< n ;i++)
      {
    	  arr[i]=sc.nextInt() ;
      }
      Arrays.sort(arr);
      
      int max=0 ;
      for (int i=0 ; i< n-1 ;i++ )
      {     int c1=1 ;
    	a:  while(arr[i]==arr[i+1])
    		  { c1++ ;
    		    i++ ;
    		    if( i==(n-1) )
    		    	break a ;
    		  }
     
    	 if(max<c1)
    		 max=c1 ;
      }
      System.out.println(n-max);
      sc.close();
	}

}
