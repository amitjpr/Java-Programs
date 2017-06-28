import java.util.Scanner;

public class Jumpingonthecloud {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        int count = 0 ;
	       a: for(int i=0 ; i< n-1; i++)
	        {
	            if( (n-2)==i)
	                { count++;
	                break a;} 
	        	
	        	else if(c[i+1]== 0 && c[i+2]==0)
	        	   { count++ ; 
	        	     i++ ;
	        	     }
	        	else if (c[i+1]== 1 && c[i+2]==0)
	        	 { count++ ; 
        	     i++ ;
        	     }
	        	else if (c[i+1]== 0 && c[i+2]==1)
	        	 {
	        	    count++  ;
	        	 }
	        }
	        
	        System.out.println(count);
	     in.close();    
	}

}
