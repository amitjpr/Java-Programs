import java.util.*;
public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int c[] = new int[n];
	        for(int i=0; i < n; i++)
	            c[i] = in.nextInt();
	        
	          
	    HashMap<Integer, Integer> map = new HashMap<>();  
	    for (int i= 0 ; i< n ; i++)
	    		{
			if (map.containsKey(c[i])) {
				int val = map.get(c);
				map.put(c[i], val + 1);
			} else {
				map.put(c[i], 1);
			}
		}
	    
	    System.out.println(map);
	    
	 
	     in.close();
	}
}
