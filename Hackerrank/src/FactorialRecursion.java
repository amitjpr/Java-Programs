import java.util.Scanner; ;

public class FactorialRecursion {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int result =factorial(n);
       System.out.println(result);
       
       sc.close();
	}

public static int factorial(int n)
   {
	 int result= 1 ;
      for(int i =1 ; i<=n ;i++)
         {
    	  result=result*i ;
         }
      return result ;
   }


}