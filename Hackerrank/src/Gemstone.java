import java.util.Arrays;
import java.util.Scanner;

public class Gemstone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ; 
		String s=sc.nextLine() ;
		String s1=sc.nextLine() ; 
		char ch[]=s.toCharArray() ; 
		Arrays.sort(ch);
		char ch1[]=s1.toCharArray() ;
		Arrays.sort(ch1);
		
		for(int i = 0 ; i<s.length() ; i++)
		{
			for(int j=0 ; j<s1.length(); j++)
			{  if( ch[i]==ch1[j])
			      {
				   System.out.print(ch[i]); ;
			      }
				}
		}
		
		sc.close();
	}

}
