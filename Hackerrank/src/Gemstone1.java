import java.util.Arrays;
import java.util.Scanner;

public class Gemstone1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ; 
		String s=sc.nextLine() ;
		String s1=sc.nextLine() ; 
		char ch[]=s.toCharArray() ; 
		Arrays.sort(ch);
		char ch1[]=s1.toCharArray() ;
		Arrays.sort(ch1);
		char ch2[]=new char[100] ;
		int a=0;
		for(int i = 0 ; i<s.length() ; i++)
		{   if( ch[i]==ch1[i])
			      { ch2[a]=ch[i] ; 
			      a++ ; 
				   System.out.print(ch[i]); 
			      }
				
		}
		for(int i=0 ; i<=a ; i++)
		{  
			System.out.println(ch2[i] );	
		}
		
		sc.close();
	}

}
