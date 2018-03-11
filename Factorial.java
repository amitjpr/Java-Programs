import java.util.*;
import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int t=sc.nextInt();
	       int a[]=new int[t];
	       for(int i=0 ; i<t;i++)
	       { a[i]=sc.nextInt();}
	       
	       for( int  i = 0 ; i<t ; i++)
	       {
	       BigInteger fact = new BigInteger("1");
	       for (int j = 1; j <= a[i]; j++) {
	           fact = fact.multiply(new BigInteger(j + ""));
	       }
	        System.out.println(fact);
	    }
	       sc.close();
 }
}
