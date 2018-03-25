import java.util.Arrays;
import java.util.Scanner;

public class Reducedclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		String s =sc.nextLine();
		for(int i=1 ; i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				s=s.substring(0,i-1)+s.substring(i+1);
				i=0;
			}
		}
		if(s.length()==0)
			System.out.print("Empty String");
		else 
			System.out.print(s);
		sc.close();
	}
}
