import java.math.BigInteger;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt() ;
		 for (int j=0 ;j<t ; j++)
		 {
	       int n=sc.nextInt();
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	        System.out.println(fact);
		 }
		 sc.close();

	}

}
