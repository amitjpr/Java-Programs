import java.util.Scanner;

public class Savetheprisoner {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
    int t=sc.nextInt() ;
    for (int i=0 ; i<t ; i++)
    {
    	int n=sc.nextInt() ;  //5
    	int m=sc.nextInt() ;  //2
    	int s=sc.nextInt() ;   //1
    	int flag=1;
    	a : for (int j =s ; j<=n ;j++)
    	{   
    		if (flag==m)
    	   { 
    		flag= j ;
    		break a ; 
    	   }
    		if(j==n)
    			j=0 ;
    		flag++ ;
    	}
    	System.out.println(flag);
    	
    }
	sc.close();
	}

}
