import java.util.Scanner;

public class AndProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		int n= sc.nextInt() ;
		for(int i =0 ; i< n ;i++)
		{
			long  a =sc.nextLong() ;
			long  b=sc.nextLong(); 
			
			for(long j=a+1 ; j<= b ; j++)
		     	{
				  a= (a&j) ; 
		     	}
			System.out.println(a);	
			
		}
		sc.close();
	}

}
