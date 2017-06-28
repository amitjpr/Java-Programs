import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String s = in.next();
	        long n = in.nextLong();
	        char ch[]=s.toCharArray();
	        int len = s.length();
	        int count =0 ;
	        long d=  n/len ;
	        long a =n%len ;
	        System.out.println(d+":::"+a);
	        for(int i =0 ; i<a ; i++)
	          {
	        	if (ch[i]=='a')
	        		count++ ;
	          }
	        int count1=0 ;
	        for(int i =0 ; i<len ; i++)
	          {
	        	if (ch[i]=='a')
	        		count1++ ;
	          }
	       System.out.println( ( (d*(long)count1) + (long)count) );
	        
	        
	       in.close();	
	}

}