import java.math.BigInteger;
import java.util.Scanner;

public class Julka {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0 ; i <10 ; i++)
		{
			BigInteger b1 , b2 ,b3 ,b4 ,b5 ;
			BigInteger k , j ;
			b1=sc.nextBigInteger();
			b2=sc.nextBigInteger();
			b3= new BigInteger("2");
			b4=b1.divide(b3);
			b5=b2.divide(b3);
			j=b4.subtract(b5);
			k=b1.subtract(j);
			System.out.println(k);
			System.out.println(j);
		}	
		sc.close();

	}

}
