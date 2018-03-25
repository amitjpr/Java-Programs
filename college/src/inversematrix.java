import java.math.BigInteger;
import java.util.Scanner;

public class inversematrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()==true)
		{ 
		 BigInteger bi1, bi2, bi3;
		 String s1=sc.next();
		 String s2=sc.next();
		 bi1 = new BigInteger(s1);
	      bi2 = new BigInteger(s2);
	      bi3 = bi1.subtract(bi2);
	      
		  bi3=bi3.abs();
	      

	      
	      System.out.println(bi3 );
		}
		 
	      sc.close();
	      
        
	}

}
