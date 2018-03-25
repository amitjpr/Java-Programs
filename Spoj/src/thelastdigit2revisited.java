import java.util.Scanner;

public class thelastdigit2revisited {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0 ;i<t ; i++)
		{
		  String a1=sc.next();
		  char arr[]=a1.toCharArray() ;
		  int len =a1.length() ;
		  int a=(int)arr[len-1]-48;
		  
		  long b=sc.nextLong() ;
		  if(b==0)
			  System.out.println(1);
		  else 
		  {
			  b=b%4 ;
			  
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
