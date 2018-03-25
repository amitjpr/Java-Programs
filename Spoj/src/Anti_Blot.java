import java.util.Scanner;

public class Anti_Blot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt() ;
		for(int i=0 ;i<t ;i++)
		{   
			
			
			int b1=0,b2=0,b3=0;
			String a=sc.next();
			sc.next();
			String b=sc.next();
			sc.next();
			String c=sc.next();
			if(a.contains("machula"))
			{
				b2=Integer.parseInt(b);
				b3=Integer.parseInt(c);
				b1=b3-b2 ;
			}
			else if(b.contains("machula"))
			{
				b1=Integer.parseInt(a);
				b3=Integer.parseInt(c);
				b2=b3-b1 ;
			}else if(c.contains("machula"))
			{
				b2=Integer.parseInt(b);
				b1=Integer.parseInt(a);
				b3=b1+b2 ;
			}
			System.out.println(b1+" + "+b2+" = "+b3);
			
		}
		
		sc.close();
	}

}
