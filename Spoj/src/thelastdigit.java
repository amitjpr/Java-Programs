import java.util.Scanner;

public class thelastdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0 ;i<t ; i++)
		{
		  int a=sc.nextInt();
		  int b=sc.nextInt() ;
		  if(b==0)
			  System.out.println(1);
		  else 
		  {
			  b=b%4 ;
			  a=a%10 ;
			  if(a==0)
				  System.out.println(0);
			  else if (b==0)
				  System.out.println((int)Math.pow(a,4)%10);
			  else if (b>0)
				  System.out.println((int)Math.pow(a,b)%10);
		  }
		}
		
		sc.close();

	}

}
