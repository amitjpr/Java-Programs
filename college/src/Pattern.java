import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0 ;
		while(sc.hasNextLine()==true)
		{ 
			String s=sc.nextLine();
			char ch[]=s.toCharArray() ;
			int len=s.length();
			if(len==1)
			{
				count++;
				System.out.println(count+" EVEN");
				
			}
			
			int index=0 ;
			for(int k=1 ; k<len ; k++)
			{
				if( ch[k]=='*')
				{  index=k;
				  break ;
				}
			}
			int i=s.indexOf('*',index+1);
			int diff=i-index ;
			System.out.println(diff);
		}
		
		
        sc.close();
	}

}
