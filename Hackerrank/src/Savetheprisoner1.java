import java.util.Scanner;

public class Savetheprisoner1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
    int t=sc.nextInt() ;
    for (int i=0 ; i<t ; i++)
    {
    	int n=sc.nextInt() ;  //5
    	int m=sc.nextInt() ;  //2
    	int s=sc.nextInt() ;   //1
    	long poisoned = (s + m - 1) % n;
    	if(poisoned == 0)
    		poisoned = n;
    	System.out.println(poisoned);
    	
    }
	sc.close();
	}

}
