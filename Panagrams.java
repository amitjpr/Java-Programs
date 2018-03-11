import java.util.Scanner;

public class Panagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine() ;
		String lowercase=s.toLowerCase();
		char ch[]=lowercase.toCharArray() ;
        int count = 0 ; 
        int len = ch.length ;  
        char c ='a';
        
        for(int i = 0 ; i< 26 ; i++)
        { 
        	a : for (int j = 0 ; j<len ; j++)
                 	{  
        		         if(c==ch[j])
        		             { 
        		        	  count++ ;
        		        	  break a ;
        		             }
                 	}
          c++ ;
        }
        
		if(count==26 )
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		
		
		sc.close();
	}

}
