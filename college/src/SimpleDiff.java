import java.util.Scanner;

public class SimpleDiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLong()==true)	
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			long c=0;
			if(a>=b)
			{
				c=a-b;
			}
			else
				c=b-a ;
			System.out.println(c);
		}
        sc.close();
	}

}
