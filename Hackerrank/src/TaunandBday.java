import java.util.Scanner;

public class TaunandBday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long sum= 0 ;
       
    	   
       if (x<y && (x+z)<y)
    	   sum=(b*x) + (w*(x+z)) ;
       else if(y<x && (y+z)<x)
    	   sum=(w*y) + (b*(y+z)) ;
       else 
    	   sum=(b*x) + (w*y) ;
       System.out.println(sum);
        }
        in.close() ;
	}

}
