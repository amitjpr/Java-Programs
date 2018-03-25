import java.util.Scanner;

public class Jumpingonthecloud {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        int count = 100 ;
	      for(int i=0 ; i<n; )
	        {
	            if(c[i]==0)
	            {
	            	count-- ;
	            }
	            if(c[i]==1)
	            {
	            	count=count-3 ;
	            }
	            i=i+k ;
	        }
	        
	        System.out.println(count);
	     in.close();    
	}

}
