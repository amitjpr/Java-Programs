import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine() ;
		double len=s.length();
		int row=(int)Math.sqrt(len);
		int width=0;
		if((row*row)==len)
			width=row;
		else 
			width=row+1 ;
		char ch[]=s.toCharArray();
		for(int i=0 ; i<width; i++)
		{
			for(int j=i ; j<len ; )
			{
				System.out.print(ch[j]);
				j=j+width;
			}
			System.out.print(" ");
		}
		
			
       sc.close();
	}

}
