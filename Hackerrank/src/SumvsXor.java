import java.util.Scanner;

public class SumvsXor {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        long a =sc.nextLong() ; 
        long count = 0 ;
        for(long i= 0 ; i<+a ; i++)
        {  
        	if((a+i)==(a^i) )
        	{ 
        		count++ ;
        	}
        }
        System.out.println(count);
       sc.close();
	}

}
