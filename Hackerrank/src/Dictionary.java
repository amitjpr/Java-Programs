import java.util.*;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        Map<String , Integer> Dic = new HashMap<String , Integer>();
	        
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            Dic.put(name , phone);
	          }
	        while(in.hasNext()){
	            String s = in.next();
	            if (Dic.containsKey(s))
	            { 
	            	System.out.println(s+"="+Dic.get(s)); 
	            	}
	            else 
	            {
	           	  System.out.println("Not found");
	            	}
	            }
	        in.close();

	}

}
