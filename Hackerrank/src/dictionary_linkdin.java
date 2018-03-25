import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dictionary_linkdin {

	public static void main(String[] args) {
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
