import java.util.Scanner;

public class nestedlogic_linkdinplacements {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int da=sc.nextInt();
		int ma=sc.nextInt();
		int ya=sc.nextInt();
		int de=sc.nextInt();
		int me=sc.nextInt();
		int ye=sc.nextInt();
		if(ye<ya)
		{
			System.out.print(10000);
			System.exit(0);
		}else if(ye>ya)
		{
			System.out.print(0);
			System.exit(0);
		}
		else if( me<ma)
		{
			System.out.print(500*(ma-me));
			
		}
		else if(de<da)
		 {
			 System.out.print(15*(da-de));
		 }
		else
			System.out.print(0);
		
	}

}
