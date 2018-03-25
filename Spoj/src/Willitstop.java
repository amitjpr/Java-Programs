import java.util.Scanner;

public class Willitstop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=0 ;
		int count =0 ;
		for(long i=0 ; k<=n ; i++)
		{
			k=(long)Math.pow(2, i);
			if(k==n)
			{  
				count++ ;
				break ;
		
			}
		}
			if(count==1)
				System.out.println("TAK");
			else
				System.out.println("NIE");
		
		
		sc.close();

	}

}
