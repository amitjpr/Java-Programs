import java.util.Scanner;

public class ApfGp {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong() ;
        long l=sc.nextLong() ;
        long sum=sc.nextLong() ;
        long n=0 ;
        n=(sum*2)/(a+l) ;
        System.out.println(n);
        long d= 0 ;
        d=(l-a)/(n-5) ;
        long b= 0 ;
        b=a-(2*d);
        for (long i=0 ; i<n ; i++)
        {  
        	System.out.print(b+(i*d)+" ");
        	
        }
        	
        
        sc.close();

	}

}
