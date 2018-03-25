import java.util.*;


class Countingtriangle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt() ;
		for(int i=0 ;i<t ;i++)
		{
			int n=sc.nextInt();
			long total=(n*(n+2)*((2*n)+1))/8  ;
			
			
			System.out.println(total) ;
		}
		
		sc.close();
	}
}