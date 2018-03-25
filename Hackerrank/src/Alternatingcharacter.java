import java.util.Scanner;

public class Alternatingcharacter {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       int n =sc.nextInt() ;
       sc.nextLine() ; 
       for(int i= 0 ; i<n ; i++)
       {
    	   String s=sc.nextLine() ;
    	   char ch[]=s.toCharArray() ;
    	   int len=s.length() ; 
    	   int del= 0; 
    	   for(int j=0 ; j<len-1 ; j++)
    	   {    
    		   if(ch[j]==ch[j+1])
    		   {
    			   del++ ;
    		   }
    	   }
    	   System.out.println(del);
       }
       
       sc.close();
	}

}
