import java.math.BigInteger;
import java.util.Scanner;

public class catandmouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt() ;
		for(int i=0 ; i< n ; i++)
		{
			BigInteger b1,b2,b3, b4,b5 ;
			b1=sc.nextBigInteger();
			b2=sc.nextBigInteger();
			b3=sc.nextBigInteger();
			b4=b3.subtract(b1);
			b4=b4.abs();
			b5=b3.subtract(b2);
			b5=b5.abs();
			
			int res=b5.compareTo(b4);
			
			if(res==0 )
				System.out.println("Mouse C");
			else if(res==1)
			{
				System.out.println("Cat A");
			}
			else
				System.out.println("Cat B");
		}
        sc.close();
	}

}
