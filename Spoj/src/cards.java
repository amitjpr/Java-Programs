import java.util.Scanner;

public class cards {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		for (int i=0 ; i < t ; i++)
		{
			long n=sc.nextInt();
			long total= ( 3*(n*n)+n )/2 ;
			System.out.println(total%1000007 );
		}
		sc.close();

	}

}
