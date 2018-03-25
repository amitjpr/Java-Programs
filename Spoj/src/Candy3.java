import java.util.Scanner;

public class Candy3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ;
		while(sc.hasNextInt()==true)
		{
		int n=sc.nextInt();
	    for(int i=0 ;i<n ;i++)
	    {
	    	int t=sc.nextInt() ;
	    	int total=0, sum ;
	    	for(int j=0 ; j<t ;j++)
	    	{
	    		sum=sc.nextInt() ;
	    		total =sum+total ;
	    	}
	    	if( (total%t)==0)
	    		System.out.println("YES");
	    	else 
	    		System.out.println("NO");
	    }
		}
		sc.close();
	}

}
