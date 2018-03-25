import java.util.Scanner;

public class qwerty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="1234567890-=`QWERTYUIOP[]ASDFGHJKL;ZXCVBNM,./";
		char ch1[]=s.toCharArray() ;
	    while(sc.hasNextLine()==true)
	    {
	    	String s1=sc.nextLine();
	    	char ch[]=s1.toCharArray() ;
	        int len =s1.length();
	        for(int i=0 ; i<len ;i++)
	        { 
	        	int ind =s.indexOf(ch[i]);
	        	if(ch[i]==' ')
	        	System.out.print(' ');
	        	else
	        	System.out.print(ch1[ind-1]);
	        }
	        System.out.println();
	    }
		sc.close();

	}

}
