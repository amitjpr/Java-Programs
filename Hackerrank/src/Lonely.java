import java.util.Arrays;
import java.util.Scanner;

public class Lonely {
	
	    
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = in.nextInt();
	        }
	        Arrays.sort(a);
	        int result= 0 ;
	       
	     b:   for (int i= 0 ; i<n ; i++)
	          {  if (i==n-1)
	               { result = i ;
	               break b ;}
	          
	          else  if(a[i]==a[i+1])
	        		 i++ ;
	        	 else 
	        	 { result= i ; 
	        	   break b ; 
	        	 }
	          }
	        System.out.println(a[result]);
	        in.close();
	}

}
