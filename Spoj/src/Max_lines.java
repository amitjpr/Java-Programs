import java.util.Scanner;

public class Max_lines {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0 ; i< n ;i++)
		{
			long r=sc.nextLong();
			r=4*r*r ;
			double f= r + 0.25 ;
			
			System.out.println("Case "+(i+1)+(char)58+" "+f);
		}
	}

}
