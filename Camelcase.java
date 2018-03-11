import java.util.*;

public class Camelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch[]=s.toCharArray();
        int count = 1 ; 
          for(int i =0 ; i<ch.length ; i++)
        {   if( (int)ch[i]>=65 && (int)ch[i]<=90 )
                {
        	         count++ ; 
                }
        	
        }
        System.out.println(count);        		
       in.close();
	}

}
