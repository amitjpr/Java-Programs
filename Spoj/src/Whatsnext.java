import java.util.Scanner;

public class Whatsnext {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ; 
	while (sc.hasNextLine()== true)
	{ 
		 int a0=sc.nextInt() ;
		 double  a1=sc.nextDouble() ;
		 int a2=sc.nextInt() ;
		 if(a0==0 && a1==0 & a2==0)
		      { System.exit(0);
		      }
		 else if( (a0*a2)==(a1*a1) )
               {  
        	      System.out.println("GP "+(int)( a2*(a1/a0 ) ) );
               }
		 else 
			 System.out.println("AP "+(int)(a2+(a1-a0)) );
	
	
	}     sc.close();
	}

}
