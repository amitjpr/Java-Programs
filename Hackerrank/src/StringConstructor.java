import java.util.Arrays;
import java.util.Scanner;

public class StringConstructor {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt() ;
       sc.nextLine() ;
       for(int k=0 ;k<n ; k++)
       {
       String s = sc.nextLine() ; 
       char ch[]=s.toCharArray() ; 
       Arrays.sort(ch);
       int count=0 ;
       for(int i=0 ; i<s.length();i++)
       {  if(i==(s.length()-1)) 
    	     count++ ;
          else if(ch[i]==ch[i+1])
    	   {
    		   count++;
    		   i++;
    	   }
    	   else 
    		   count++;
       }
       System.out.println(count);
       }
       sc.close();
	}

}
