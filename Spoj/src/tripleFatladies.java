import java.util.Scanner;

public class tripleFatladies {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt() ;
		for(int i=0 ; i<t ; i++)
		{
			long n=sc.nextLong();
			long k =192 ;
			if(n==1)
			{
				System.out.println(k);
			}else
			{
		     System.out.println(k+(250*(n-1))  );
			}
		}
		
		
		sc.close();
	}

}
